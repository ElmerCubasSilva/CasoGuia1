package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Producto....:");
		String producto = sc.next();
		
		System.out.print("Precio......:");
		float precio = sc.nextFloat();
		
		System.out.print("Cantidad....:");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		float igv =(float) (importe * 0.18);
		float des = (float) ( igv * 0.3);
		float descuento = (float) (igv - des);
		float total = (float) ( importe - descuento + igv);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("---------------------------");
		System.out.println("Producto...:" + producto);
		System.out.println("Importe....:" + df.format(importe));
		System.out.println("IGV........:" + igv);
		System.out.println("Descuento..:" + df.format(descuento));
		System.out.println("Total......:" + df.format(total));
		
		
		

	}

}
