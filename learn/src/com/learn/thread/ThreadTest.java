package com.learn.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

	public static void main(String[] args) {

		r();
		c();
		t();
	}
	public static void r() {
		RunnableImpl rImpl = new RunnableImpl();
		Thread thread = new Thread(rImpl);
		thread.start();
	}
	public static void c() {
		CallableImpl cImpl = new CallableImpl();
		FutureTask<Integer> fTask = new FutureTask<Integer>(cImpl);
		Thread thread = new Thread(fTask);
		thread.start();
		
		try {
			System.out.println(fTask.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	public static void t() {
		ThreadExt tExt = new ThreadExt();
		tExt.start();
	}

}
