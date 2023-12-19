package com.hello.project.conditional;
public class MyMessagePrint implements MessagePrint{
	@Override
	public String showMessage() {
		return "test.properties文件存在。";
	}
}
