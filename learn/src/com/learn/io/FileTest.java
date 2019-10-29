package com.learn.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("e://新建文件夹");
		listAllFiles(file);
	}
	
	public static void listAllFiles(File dir) {
	    if (dir == null || !dir.exists()) {
	        return;
	    }
	    if (dir.isFile()) {
	        System.out.println(dir.getName());
	        return;
	    }
	    for (File file : dir.listFiles()) {
	        listAllFiles(file);
	    }
	}
	public void test() throws IOException {
		File file = new File("a.txt");
		file.createNewFile();

	}
}
