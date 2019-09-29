package com.learn.pattern.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory3 implements MethodInterceptor{

	//维护一个目标对象
	private Object target;
	public ProxyFactory3(Object target) {
		this.target = target;
	}
	//给对象创建一个目标对象
	public Object getProxyInstance() {
		//1.工具类
		Enhancer e = new Enhancer();
		//2.设置父类
		e.setSuperclass(target.getClass());
		//3.设置回调函数
		e.setCallback((Callback) this);
		//4.创建子类
		return e.create();
	}
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		
		System.out.println("开始事务...");
		//执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        System.out.println("提交事务...");

        return returnValue;
	}
}
