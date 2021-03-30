package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Horas Trabajadas:");
		float h = sc.nextFloat();
	
		System.out.print("Ingrese Tarifa por Hora:");
		float t = sc.nextFloat();
		
		float sueldo = h * t;
		float bono = (float) (sueldo * 0.05);
		float total = sueldo + bono;
		float tdolares = (float) (total / 3.24);
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("Sueldo............: " + df.format(sueldo) );
		System.out.println("Bono..............: " + df.format(bono));
		System.out.println("Total.............: " + df.format(total));
		System.out.println("Total en dolares..: " + df.format(tdolares));
	}
	
		

	}


