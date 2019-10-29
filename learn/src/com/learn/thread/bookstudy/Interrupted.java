package com.learn.thread.bookstudy;

import java.util.concurrent.TimeUnit;

public class Interrupted {

    public static void main(String[] args) throws  InterruptedException{
        //sleepThread不停的尝试睡眠
        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(true);
        //busyThread不停的运行
        Thread busyThread = new Thread(new BusyRunner(), "BusyThread");
        sleepThread.start();
        busyThread.start();
        System.out.println("SleepThread's state: " + sleepThread.getState());
        System.out.println("BusyThread's state: " + busyThread.getState());

        //休眠5秒，让sleepThread和busyThread充分运行
        TimeUnit.SECONDS.sleep(5);
        sleepThread.interrupt();
        busyThread.interrupt();

        System.out.println("SleepThread's state: " + sleepThread.getState());
        System.out.println("BusyThread's state: " + busyThread.getState());


        System.out.println("SleepThread interrupted：" + sleepThread.isInterrupted());
        System.out.println("BusyThread interrupted：" + busyThread.isInterrupted());

        System.out.println("SleepThread's state: " + sleepThread.isAlive());
        System.out.println("BusyThread's state: " + busyThread.isAlive());
        //防止sleepThread和busyThread立刻退出
        SleepUtils.second(5);
    }
    static class SleepRunner implements Runnable{

        @Override
        public void run() {
            while (true){
                SleepUtils.second(10);
            }
        }
    }
    static class BusyRunner implements Runnable{

        @Override
        public void run() {
            while (true){

            }
        }
    }
}
