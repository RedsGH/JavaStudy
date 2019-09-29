package com.learn.pattern.proxy;

public class IUserDao implements UserDao{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存成功");
	}

}
