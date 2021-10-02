package com.threads;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPerformance {

    private static int THREAD_COUNT = 1;

    public static void main(String args[]) {

        try {
            startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/calculate", new WordCountHandler());
        Executor executor = Executors.newFixedThreadPool(THREAD_COUNT);
        server.setExecutor(executor);
        server.start();
    }

    private static class WordCountHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            String[] keyValue = query.split("=");
            String action = keyValue[0];
            String num = keyValue[1];
            if(!action.equals("square")) {
                exchange.sendResponseHeaders(400, 0);
                return;
            }

            BigInteger result = square(Integer.parseInt(num));

            byte[] response = result.toString().getBytes();
            exchange.sendResponseHeaders(200, response.length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response);
            outputStream.close();
        }

        private BigInteger square(int num) {
            return new BigInteger(Integer.toString(num)).multiply(new BigInteger(Integer.toString(num)));
        }
    }

}
