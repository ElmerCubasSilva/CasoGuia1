package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Ingrese Cantidad..:");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese Precio....:");
		float precio = sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = (float) (importe1 / 3.24);
		float importe3 = (float) (importe1 / 3.75);
		
		System.out.println("----- Resultados -----");
		System.out.println("Importe en Soles..:  "  +  df.format(importe1));
		System.out.println("Importe en dolares:  "  +  df.format(importe2));
		System.out.println("Importe en euros..:  "  +  df.format(importe3));
		
		
	}

}
