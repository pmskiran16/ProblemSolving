package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadSample2 {

    private static int MAX_PASSCODE = 9999;

    public static void main(String args[]) {

        Vault vault = new Vault(new Random().nextInt(MAX_PASSCODE));

        List<Thread> threadList = new ArrayList<>();
        HackerThread1 hackerThread1 = new HackerThread1(vault);
        HackerThread2 hackerThread2 = new HackerThread2(vault);
        PoliceThread policeThread = new PoliceThread();
        threadList.add(hackerThread1);
        threadList.add(hackerThread2);
        threadList.add(policeThread);

        for (Thread thread:threadList) {
            thread.start();
        }

    }

    private static class Vault {
        private int password;

        public Vault(int pwd) {
            this.password = pwd;
        }

        public boolean isMatch(int pwd){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.password == pwd;
        }
    }

    private static abstract class HackerThread extends Thread {
        protected Vault vault;

        public HackerThread(Vault vault) {
            this.vault = vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public synchronized void start() {
            System.out.println("Starting thread "+this.getName());
            super.start();
        }
    }

    private static class HackerThread1 extends HackerThread {

        public HackerThread1(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for(int i = 0; i <= MAX_PASSCODE; i++) {
                if(vault.isMatch(i)) {
                    System.out.println("Passcode "+ i + "found to Hacker "+currentThread().getName());
                    System.exit(0);
                }
            }
        }
    }

    private static class HackerThread2 extends HackerThread {
        public HackerThread2(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for(int i = MAX_PASSCODE; i >= 0; i--) {
                if(vault.isMatch(i)) {
                    System.out.println("Passcode "+ i + "found to Hacker "+currentThread().getName());
                    System.exit(0);
                }
            }
        }
    }

    private static class PoliceThread extends Thread {

        @Override
        public void run() {

            for(int i=0; i<=10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Police Thread checking.. "+i);
            }

            System.out.println("Police Thread protects the Vault..");
            System.exit(0);
        }
    }
}
