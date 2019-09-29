package com.learn.synchr_reentr;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class synchronizedTest implements Runnable{

    //作用于对象
    public void func(){
        synchronized (this){
            for (int i = 0; i < 50; i++) {
                System.out.print(i + " ");
            }
        }
    }
    public synchronized  void fund(){}

    //作用于类
    public void fune(){
        synchronized (synchronizedTest.class){
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
    public synchronized static void funf(){}

    public static void demo01(){
        synchronizedTest synchronizedTest1 = new synchronizedTest();
        synchronizedTest synchronizedTest2 = new synchronizedTest();
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(()-> synchronizedTest1.func());
        executor.execute(()-> synchronizedTest2.func());
    }
    public static void demo02(){
        synchronizedTest synchronizedTest1 = new synchronizedTest();
        synchronizedTest synchronizedTest2 = new synchronizedTest();
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(()-> synchronizedTest1.fune());
        executor.execute(()-> synchronizedTest2.fune());
    }

    @Override
    public void run() {

    }

    public static void main(String[] args){
        demo01();
        //Thread.sleep(1000);
        //System.out.println();
        //demo02();
    }

}
