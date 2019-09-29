package com.learn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	    A a1 = new A(123, "abc");
	    String objectFile = "e://新建文件夹//pro.txt";

	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
	    objectOutputStream.writeObject(a1);
	    objectOutputStream.close();

	    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
	    A a2 = (A) objectInputStream.readObject();
	    objectInputStream.close();
	    System.out.println(a2);
	}

	private static class A implements Serializable {

	    private int x;
	    private String y;

	    A(int x, String y) {
	        this.x = x;
	        this.y = y;
	    }

	    @Override
	    public String toString() {
	        return "x = " + x + "  " + "y = " + y;
	    }
	}

}
