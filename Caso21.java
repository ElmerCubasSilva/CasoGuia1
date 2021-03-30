package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.println("\n--- R E G R E S O  A  C L A S E S ---");
		System.out.print("Valor de gasto: ");
		float gasto_1 = sc.nextFloat();
		
		float valredu_1 = gasto_1 * 0.88f;
		
		System.out.println("Valor reducido: " + valredu_1);

	}

}
	
		
		

	

