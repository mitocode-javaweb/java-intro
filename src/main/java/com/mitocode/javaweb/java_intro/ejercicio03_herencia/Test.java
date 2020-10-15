package com.mitocode.javaweb.java_intro.ejercicio03_herencia;

public class Test {

	public static void main(String[] args) {
		Super sub = new Sub();
		System.out.println(sub.greeting() + " - " + sub.name());
	}
}

class Super {
	static String greeting() {
		return "Goodnight";
	}

	String name() {
		return "Richard";
	}
}

class Sub extends Super {
	static String greeting() {
		return "Hello";
	}

	@Override
	String name() {
		return "Dick";
	}
}