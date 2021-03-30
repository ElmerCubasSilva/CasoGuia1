package com.senati.eti;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer Numero:");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo Numero:");
		n2 = sc.nextFloat();
		
		float prome = (n1 + n2)/ 2;
		float pro1 =  (float) (( n1 * 0.20 )+ n1);
		float pro2 =  (float) (n2 -( n2 * 0.30 ));
		
		
		System.out.println("----- Resultados -----");
		System.out.println("Resultados: " + prome);
		System.out.println("Resultados: " + pro1);
		System.out.println("Resultados: " + pro2);

	}

}
