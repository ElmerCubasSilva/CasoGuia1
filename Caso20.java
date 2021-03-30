package com.senati.eti;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de  la venta: " + "S/. ");
		float venta_1 = sc.nextFloat();
		
		float aumento_1 = (venta_1 * 1.42f);
		
		System.out.println("Valor incrementado  : " + "S/. " + aumento_1);

	}

}
	

