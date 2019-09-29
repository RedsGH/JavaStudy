package com.learn.synchr_reentr;

public class CantReEnterLock {
    private boolean isLocked = false;
    public synchronized void lock() throws InterruptedException{
        while(isLocked){
            System.out.println("不可重入锁：wait()");
            wait();
        }
        System.out.println("不可重入锁：isLocked = true");
        isLocked = true;
    }
    public synchronized void unlock(){
        System.out.println("不可重入锁：isLocked = false");
        isLocked = false;
        notify();
    }
}
