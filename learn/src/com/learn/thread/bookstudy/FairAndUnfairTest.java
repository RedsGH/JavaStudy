package com.learn.thread.bookstudy;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairAndUnfairTest {
    private static Lock fairLock = new ReentrantLock2(true);
    private static Lock unfairLock = new ReentrantLock2(false);

    @Test
    public void fair(){
        testLock(fairLock);
    }
    @Test
    public void unfair(){
        testLock(unfairLock);
    }

    private void testLock(Lock lock){
        //启动5个Job
        for (int i = 0; i < 5; i++){
            new Job(lock).start();
        }
    }


    private static class Job extends Thread{
        private Lock lock;

        public Job(Lock lock){
            this.lock = lock;
        }
        public void run(){
            // TODO 连续2次打印当前的Thread和等待队列中的Thread
            System.out.println(Thread.currentThread().getName());
        }
    }
    private static class ReentrantLock2 extends ReentrantLock{
        public ReentrantLock2(boolean fair){
            super(fair);
        }
        public Collection<Thread> getQueuedThreads(){
            List<Thread> arrayList = new ArrayList<Thread>(super.getQueuedThreads());
            Collections.reverse(arrayList);
            return arrayList;
        }
    }
}

