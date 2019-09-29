package com.learn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOp {

	public static void main(String[] args) {

		String src = "e://新建文件夹//pro.txt";
		String dist = "e://新建文件夹//字节操作//复制.txt";
		try {
			copyFile(src, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyFile(String src, String dist) throws IOException {
	    FileInputStream in = new FileInputStream(src);
	    FileOutputStream out = new FileOutputStream(dist);

	    byte[] buffer = new byte[20 * 1024];
	    int cnt;

	    // read() 最多读取 buffer.length 个字节
	    // 返回的是实际读取的个数
	    // 返回 -1 的时候表示读到 eof，即文件尾
	    while ((cnt = in.read(buffer, 0, buffer.length)) != -1) {
	        out.write(buffer, 0, cnt);
	        System.out.println("正在写入");
	    }

	    in.close();
	    out.close();
	}

}
