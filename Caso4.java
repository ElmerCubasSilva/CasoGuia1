package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float n1 = 0, n2 = 0 , n3 = 0, n4 = 0;
		
		System.out.print("Primer Numero:");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo Numero:");
		n2 = sc.nextFloat();
		
		System.out.print("Tercer Numero:");
		n3 = sc.nextFloat();
		
		System.out.print("Cuarto Numero:");
		n4 = sc.nextFloat();
		
		float suma = n1 + n2 + n3 +n4;
		float resta = ((n1 - n2) -  (n3 - n4));
		float producto = ((n1 * n2) * (n3 * n4));
	    float division = ((n1 / n2) / (n3 / n4));
		float Resto_entero = n1 % n2 % n3 % n4;
		
		System.out.println("----- Resultados -----");
		System.out.println("Suma.........: " + suma);
		System.out.println("Resta........: " + resta);
		System.out.println("Producto.....: " + producto);
		System.out.println("Division.....: " + df.format(division));
		System.out.println("Resto Entero.: " + Resto_entero);
		
	}

}
