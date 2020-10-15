package com.mitocode.javaweb.java_intro.ejercicio02_estaticos;

public class Test {
	
	public static void main(String[] args) {
		One one = new One();
		Two two = new Two();
	}
}

class Super {
	static {
		System.out.println("Super ...");
	}
}

class One {
	static {
		System.out.println("One ...");
	}
}

class Two extends Super {
	static {
		System.out.println("Two ...");
	}
}