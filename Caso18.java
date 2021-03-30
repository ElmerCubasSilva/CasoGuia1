package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.print("Ingrese la Base del triangulo:");
		float b = sc.nextFloat();
	
		System.out.print("Ingrese la Altura del Triangulo:");
		float a = sc.nextFloat();
		
		float area= (b * a)/2;
		
		System.out.println(" -----  R E S U L T A D O S ----- ");
		System.out.println("El Area del Triangulo es: " + df.format(area) + " cm");

	}

}
