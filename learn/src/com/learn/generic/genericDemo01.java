package com.learn.generic;

import java.util.ArrayList;
import java.util.List;

public class genericDemo01 {

	// 不使用泛型，存取数据麻烦
	  public static void test1(){
		  
	    List list = new ArrayList();
	    list.add(100);
	    list.add("zhang");
	    /*
	     * 从集合中获取的数据是Object类型，Object类型是所有类型的根类，但是在具体使用的时候需要
	     * 类型检查，类型转化，处理类型转化异常
	     * 使用麻烦
	     */
	    Object o = list.get(1);
	    if (o instanceof String) {
	     String s = (String)o;
	    }
	    System.out.println(o);
	  }
	  
	  // 使用泛型
	  public static void test2(){
	    List<String> list = new ArrayList<String>();
	    //list.add(100); 放数据时安全检查，100不是String类型，不能存放
	    list.add("存数据安全，取数据省心");
	    String s = list.get(0); //取出来的数据直接就是泛型规定的类型
	    System.out.println(s);
	    
	  }
	  
	  public static void test3() {
		  /**
		   * 自定义泛型的使用
		   * 在声明时指定具体的类型
		   * 不能为基本类型
		   * @author Administrator
		   *
		   */
		  genericStudent<Integer> student = new genericStudent<Integer>();
		  student.setJavase(85);
		  System.out.println(student.getJavase());  
		  
		  genericStudent<String> student1 = new genericStudent<String>();
		  student1.setJavase("电子信息");
		  System.out.println(student1.getJavase()); 
	  }
	  public static void main(String[] args) {
	    test1();
	    test2();
	    test3();
	  }
}
