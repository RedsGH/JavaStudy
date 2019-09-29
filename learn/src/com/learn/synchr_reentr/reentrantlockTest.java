package com.learn.synchr_reentr;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrantlockTest {

    private Lock lock = new ReentrantLock();

    public void func(){
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }finally {
            lock.unlock(); // 确保释放锁，从而避免发生死锁。
        }
    }
    public static void main(String[] args){

        reentrantlockTest reentrantlockTest = new reentrantlockTest();
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(()->reentrantlockTest.func());
        executor.execute(()->reentrantlockTest.func());
    }
}
