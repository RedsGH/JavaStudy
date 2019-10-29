package com.learn.thread.bookstudy;

import java.util.concurrent.locks.*;

public class my {
    Lock lock = new ReentrantLock();

    ReentrantReadWriteLock reentrantReadWriteLock;
    LockSupport lockSupport;
}
