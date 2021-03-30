package com.senati.eti;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Numero de Aprobados..:");
		int na = sc.nextInt();
		
		System.out.print("Numero de Desaprobados..:");
		int nd = sc.nextInt();
		
		System.out.print("Numero de Retirados..:");
		int nr = sc.nextInt();
		
		float total = na + nd + nr;
		
		float pa = na / total * 100;
		float pd = nd / total * 100;
		float pr = nr / total * 100;
		
		System.out.println("----- Resultados -----");
		System.out.println("Importe en Soles..:  "  +  df.format(pa)+ "%");
		System.out.println("Importe en dolares:  "  +  df.format(pd)+ "%");
		System.out.println("Importe en euros..:  "  +  df.format(pr)+ "%");


	}

}
