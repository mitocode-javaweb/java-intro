package com.mitocode.javaweb.java_intro.ejercicio11_genericos;

public class Elemento<T, K> {
	
	private T variable;
	private T[] arreglo;
	private K otroCampo;
	
	public Elemento(T variable, K otroCampo) {
		this.variable = variable;
		this.otroCampo = otroCampo;
	}
	
	public Elemento(T variable, T[] arreglo, K otroCampo) {
		this.variable = variable;
		this.arreglo = arreglo;
		this.otroCampo = otroCampo;
	}
	
	public void mostrarTipos() {
		System.out.println("T es una clase de tipo: "  + variable.getClass());
		System.out.println("K es una clase de tipo: "  + otroCampo.getClass());
	}

	public T getVariable() {
		return variable;
	}

	public void setVariable(T variable) {
		this.variable = variable;
	}

	public K getOtroCampo() {
		return otroCampo;
	}

	public void setOtroCampo(K otroCampo) {
		this.otroCampo = otroCampo;
	}

	public T[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(T[] arreglo) {
		this.arreglo = arreglo;
	}
	
	
	

}