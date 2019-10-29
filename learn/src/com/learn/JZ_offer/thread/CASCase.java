package com.learn.JZ_offer.thread;

public class CASCase {
    public volatile int value;

    public synchronized void add() {
        value++;
    }
}
