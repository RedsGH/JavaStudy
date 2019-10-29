package com.learn.thread.bookstudy;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁示例
 */
public class Cache {

    static Map<String, Object> map = new HashMap<String, Object>();
    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock r = readWriteLock.readLock();
    static Lock w = readWriteLock.writeLock();
    // 获取一个key对应的value
    public static final Object get(String key){
        r.lock();
        try {
            return map.get(key);
        }finally {
            r.unlock();
        }
    }
    // 设置key对应的value，并返回旧的value
    public static final Object put(String key, Object value){
        w.lock();
        try {
            return map.put(key, value);
        }finally {
            w.unlock();
        }
    }
    // 清空所有内容
    public static final void clear(){
        w.lock();
        try {
            map.clear();
        }finally {
            w.unlock();
        }
    }
}
