package com.mitocode.javaweb.java_intro.ejercicio10_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Programa10_Map {

	public static void main(String[] args) {
		
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("PE", "Perú");
		paises.put("CO", "Colombia");
		paises.put("EC", "Ecuador");
		paises.put("CH", "Chile");
		paises.putIfAbsent("CH", "Otro pais");
		paises.put(null, "Desconocido");
		paises.put("YY", null);
		
		System.out.println("Llaves:");
		for (String llave : paises.keySet()) {
			System.out.println(llave);
		}
		
		System.out.println("*****");
		for (String valor : paises.values()) {
			System.out.println(valor);
		}
		
		System.out.println("*****");
		for (Entry<String, String> map : paises.entrySet()) {
			System.out.println("key:" + map.getKey() + " value: " + map.getValue());
		}
		
		System.out.println("*****");
		System.out.println("El valor de 'null': " + paises.getOrDefault(null, "Llave no encontrada"));
	}
}
