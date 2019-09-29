package com.learn.overlr;

import java.io.Serializable;

public class overloadTest {

	public void test(String string, int i) {
		
	}
	public void test(int i, char c) {
		
	}
	public void test() {
		
	}
	/*
	 * Duplicate method test() in type overloadTest
	 *
	public int test() {
		
	}
	*
	*
	* Duplicate method test() in type overloadTest
	*
	public String test(int i, char c) {
		
	}
	*/
	public int test(int i) {
		
		return i;
	}
}
