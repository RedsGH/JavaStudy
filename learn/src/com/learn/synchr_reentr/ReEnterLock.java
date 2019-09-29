package com.learn.synchr_reentr;

public class ReEnterLock {

         boolean isLocked = false;
        Thread  lockedBy = null;
        int lockedCount = 0;
        public synchronized void lock()
                throws InterruptedException{
            Thread thread = Thread.currentThread();
            while(isLocked && lockedBy != thread){
                System.out.println("可重入锁：wait()，当前线程：" + thread);
                wait();
            }
            System.out.println("可重入锁：isLocked = true，当前线程：" + thread);
            isLocked = true;
            lockedCount++;
            lockedBy = thread;
        }
        public synchronized void unlock(){
            if(Thread.currentThread() == this.lockedBy){
                System.out.println("可重入锁：lockedCount--，当前线程：" + Thread.currentThread());
                lockedCount--;
                if(lockedCount == 0){
                    System.out.println("可重入锁：isLocked = false，当前线程：" + Thread.currentThread());
                    isLocked = false;
                    notify();
                }
            }
        }
    }
