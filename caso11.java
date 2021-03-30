package com.senati.eti;

import java.util.Scanner;

public class caso11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("==========RESULTADOS==========");
		System.out.println("Cantidad de caracteres: " + nombre.length());
		
	}

}