package com.learn.generic;

/**
 * 自定义泛型接口
 *
 * 接口中泛型字母只能使用在方法中，不能使用在全局常量中
 *
 * @author Administrator
 * @param <T>
 */
public interface genericComparator<T1,T2> {
  
  //public static final T1 MAX_VALUE = 100; //接口中泛型字母不能使用在全局常量中
  //T1 MAX_VALUE;
  public static final int MAX_VALUE = 100;
  String iString  = new String();
  StringBuffer iBuffer = new StringBuffer();
  StringBuilder iBuilder = new StringBuilder();
  
  void compare(T2 t);
  T2 compare();
  public abstract T1 compare2(T2 t);//?
}

