package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Radio:");
		float r = sc.nextFloat();
		float rr = (float) Math.pow(r,2) ;
		float area = (float) (3.1416 * rr);
		float perimetro =(float) (2*3.1416)*r;
		
		System.out.println("----- Resultados -----");
		System.out.println("Area del circulo.......:"  +  area);
		System.out.println("Perimetro..............:" + perimetro);

	}

}
