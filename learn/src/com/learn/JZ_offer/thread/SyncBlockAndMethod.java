package com.learn.JZ_offer.thread;

public class SyncBlockAndMethod {

    public void syncsTask() {
        //
        synchronized (this) {
            System.out.println("Hello");
            synchronized (this){
                System.out.println("World");
            }
        }
    }

    public synchronized void syncTask() {
        System.out.println("Hello Again");
    }

}
