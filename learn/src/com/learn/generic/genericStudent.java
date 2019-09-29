package com.learn.generic;

/**
 * 自定义泛型类
 *
 * 定义"模版"的时候，泛型用泛型字母：T 代替
 * 在使用的时候指定实际类型
 *
 * @author Administrator
 * @param <T>
 */
public class genericStudent<T> {
  
  private T javase;
  
  //private static T javaee;   // 泛型不能使用在静态属性上
 
  public genericStudent() {
  }
 
  public genericStudent(T javase) {
    this();
    this.javase = javase;
  }
 
  public T getJavase() {
    return javase;
  }
 
  public void setJavase(T javase) {
    this.javase = javase;
  }
  
}

