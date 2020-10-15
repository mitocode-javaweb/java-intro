package com.mitocode.javaweb.java_intro.ejercicio03_herencia;

public class Point3d extends Point {
	protected int z;

	void move(int dx, int dy, int dz) {
		x += dx;
		y += dy;
		z += dz;
	}
}
