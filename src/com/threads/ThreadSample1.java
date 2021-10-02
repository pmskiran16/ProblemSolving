package com.threads;

public class ThreadSample1 {
    public static void main(String args[]) {

        /*System.out.println("This is before start worker thread.. from "+Thread.currentThread().getName());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from inside worker Thread.. "+Thread.currentThread().getName());
            }
        });
        thread.start();
        System.out.println("This is after start worker thread.. from "+Thread.currentThread().getName());*/


        /*Thread thread1 = new Thread(new MyThread1());
        thread1.start();
        thread1.interrupt();*/

        Thread thread2 = new Thread(new MyThread2());
        thread2.start();
        thread2.interrupt();

    }

    private static class MyThread1 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted explicitly.");
            }
        }
    }

    private static class MyThread2 implements Runnable {
        @Override
        public void run() {
            if(Thread.currentThread().isInterrupted()) {
                System.out.println("Preemptive interrupt.");
                return;
            }

            System.out.println("We are in thread "+Thread.currentThread().getName());
        }
    }
}

