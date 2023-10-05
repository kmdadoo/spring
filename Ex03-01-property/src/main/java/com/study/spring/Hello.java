package com.study.spring;

public class Hello
{
	//DTO객체 생성시 정보은닉을 위해 private으로 선언한다. 
	private String name;  
	private String nickname;  
	private Printer printer;
	
	//꼭 필요한 경우가 아니라면 생성자는 생략한다. 
	//public으로 선언된 getter/setter를 선언한다.
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public String sayHello() {
		return "Hello " + name + " : " + nickname;
	}
	public void print() {  
		printer.print(sayHello());
	}
}
