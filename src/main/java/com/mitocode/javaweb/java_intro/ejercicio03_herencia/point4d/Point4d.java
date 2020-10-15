package com.mitocode.javaweb.java_intro.ejercicio03_herencia.point4d;

import com.mitocode.javaweb.java_intro.ejercicio03_herencia.Point3d;

public class Point4d extends Point3d {
	int w;

	public void move(int dx, int dy, int dz, int dw) {
		x += dx;
		y += dy;
		z += dz;
		w += dw;
	}
}
