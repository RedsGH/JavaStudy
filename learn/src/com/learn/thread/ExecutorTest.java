package com.learn.thread;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	static int i = 0;
	public static void main(String[] args) {
		
		//ct();
		//ft();
		//st();
		for(System.out.print("1 ");out() ;System.out.print("3 ")) {
			System.out.print("4 ");
		}
	}
	public static boolean out() {
		i++;
		if(i > 5) {
			return false;
		}
		System.out.print("2 ");
		return true;
	}
	public static void ct() {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new RunnableImpl());
		}
		executorService.shutdown();
	}
	public static void ft() {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			executorService.execute(new RunnableImpl());
		}
		executorService.shutdown();
	}
	public static void st() {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new RunnableImpl());
		}
		executorService.shutdown();
	}
}
