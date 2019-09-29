package com.learn.synchr_reentr;

public class LockTest {

    static CantReEnterLock cantReEnterLock = new CantReEnterLock();
    static ReEnterLock reEnterLock = new ReEnterLock();
    public static void print1() throws InterruptedException {
        cantReEnterLock.lock();
        doAdd1();
        cantReEnterLock.unlock();
    }
    public static void doAdd1() throws InterruptedException {
        cantReEnterLock.lock();
        //do something
        cantReEnterLock.unlock();
    }
    public static void print2() throws InterruptedException {
        reEnterLock.lock();
        doAdd2();
        reEnterLock.unlock();
    }
    public static void doAdd2() throws InterruptedException {
        reEnterLock.lock();
        //do something
        reEnterLock.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        //print1();
        print2();
    }
}
