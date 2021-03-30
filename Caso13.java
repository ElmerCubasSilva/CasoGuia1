package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese nombre:");
		String nombre= sc.nextLine();
		
		System.out.print("ingrese apellido:");
		String apellido= sc.nextLine();

		System.out.println("-----Resultado-----s");
		System.out.println("Alumno(a).." + nombre + "" + apellido);
	}

}
