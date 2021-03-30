package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float nn = (float) Math.pow(3, 2);
		float n = (float) (17 * 2 + nn - 6)/5;
		float nn2 = (float) (4.7 - 1.2 * 2);
		float nnf = (float) n - (2 *nn2);
		
		System.out.println("----- R E S U L T A D O -----: ");
		System.out.println("Respuesta: " + df.format(nnf));

	}

}
