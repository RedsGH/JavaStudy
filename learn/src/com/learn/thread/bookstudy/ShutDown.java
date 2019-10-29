package com.learn.thread.bookstudy;

import java.util.concurrent.TimeUnit;

public class ShutDown {

    public static void main(String[] args) throws InterruptedException {

        Runner one = new Runner();
        Thread countThread = new Thread(one, "ntThread");
        countThread.start();
        //睡眠一秒，main线程对CountThread中断，使CountThread能够感知中断而结束
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();
        System.out.println(countThread.getState());
        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");
        System.out.println(countThread.getState());
        countThread.start();
        //睡眠一秒，main线程对Runner two进行取消，使CountThread能够感知中断而结束
        TimeUnit.SECONDS.sleep(1);
        two.cancel();

        TimeUnit.SECONDS.sleep(10);
        System.out.println(countThread.getState());
    }
    private static class Runner implements Runnable{

        private long i;
        private volatile boolean on = true;
        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("Count i = " + i);
        }
        public void cancel(){
            on = false;
        }
    }
}
