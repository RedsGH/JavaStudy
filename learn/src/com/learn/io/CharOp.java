package com.learn.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CharOp {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str1 = "中文";
		byte[] bytes = str1.getBytes("UTF-8");//指定一个编码方式将它编码为字节序列
		String str2 = new String(bytes, "UTF-8");//指定编码方式将字节序列解码为String
		System.out.println(str2);
		
		try {
			readFileContent("e://新建文件夹//pro.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFileContent(String filePath) throws IOException {

	    FileReader fileReader = new FileReader(filePath);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);

	    String line;
	    while ((line = bufferedReader.readLine()) != null) {
	        System.out.println(line);
	    }

	    // 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
	    // 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
	    // 因此只要一个 close() 调用即可
	    bufferedReader.close();
	}

}