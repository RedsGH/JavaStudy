package com.learn.thread.bookstudy;

import java.util.concurrent.TimeUnit;

//Profiler 可以 被 复 用在 方法 调用 耗时 统计 的 功能上，
public class Profiler {
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>();
    protected Long initialValue(){
        return System.currentTimeMillis();
    }
    public static final void begin(){
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }
    public static final long end(){
        System.out.println("pre: " + TIME_THREADLOCAL.get());
        System.out.println("now: " + System.currentTimeMillis());
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }
    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Cost: " + Profiler.end() + " mills");
    }
}
