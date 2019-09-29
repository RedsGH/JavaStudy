package com.learn.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterruptExeptionTest {

	public static void main(String[] args) {
		
		i1();
		i2();
		i3();
	}
	
	public static void i1() {
		Thread mThread1 = new myThread1();
		mThread1.start();
		mThread1.interrupt();
		System.out.println("i1 run");
	}
	public static void i2() {
		Thread mThread1 = new myThread1();
		mThread1.start();
		mThread1.interrupt();
		System.out.println("i2 run");
	}
	public static void i3() {
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(() -> {
			
			try {
				Thread.sleep(2222);
				System.out.println("thread run");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		executorService.shutdownNow();
		System.out.println("i3 run");
	}
	
	private static class myThread1 extends Thread{
		
		public void run() {
			try {
				Thread.sleep(2222);
				System.out.println("thread run");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private static class MyThread2 extends Thread {
		
        public void run() {
            while (!interrupted()) {
                // ..
            }
            System.out.println("Thread end");
        }
    }
}
