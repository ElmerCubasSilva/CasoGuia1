package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.print("Ingrese lado 1:");
		float l1 = sc.nextFloat();
	
		System.out.print("Ingrese lado 2:");
		float l2 = sc.nextFloat();
		
		System.out.print("Ingrese lado 3:");
		float l3 = sc.nextFloat();
		
		float perimetro = (l1 + l2 + l3);
		
		System.out.println(" -----  R E S U L T A D O S ----- ");
		System.out.println("El Area del Triangulo es: " + df.format(perimetro) + " cm");

	}

}
