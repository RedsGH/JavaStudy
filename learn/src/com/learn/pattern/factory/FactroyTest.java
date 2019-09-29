package com.learn.pattern.factory;

public class FactroyTest {

	PhoneFactory xm = new XiaoMiFactory();
	Cpu c = xm.getCpu();
}
