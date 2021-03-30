package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("--- L I B R E T A ---");
		
		System.out.print("\nMonto 1 .......:");
		float m1 = sc.nextFloat();
		System.out.print("Monto 2 .......:");
		float m2 = sc.nextFloat();
		System.out.print("Monto 3 .......:");
		float m3 = sc.nextFloat();
		
		float r1 = m1/5;
		float r2 =(float) (m2 * 0.20);
		float r3 = (r1 + r2);
		
		
		float rr1 = (m1 + m2 + m3);
		float rr2 =(float) (m3 * 0.60);
		float rr3 = (rr1 + rr2);
		float rr4 =(float) (rr1 *0.08);
		float rr5 =(float) (rr1 - rr4);
		
		
		System.out.println("--- R E S U L T A D O S ---");
		System.out.println("Resultado 1: " + r3);
		System.out.println("Resultado 2: " + rr3);
		System.out.println("Resultado 3: " + df.format(rr5));
		

	}

}
