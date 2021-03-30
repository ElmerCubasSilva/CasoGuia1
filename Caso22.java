package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.println("--- L I B R E T A ---");
		System.out.print("Ingrese Nombre:");
		String nombre=sc.next();
		
		
		System.out.println("\nNota 1 .......:");
		float n1 = sc.nextFloat();
		System.out.println("Nota 2 .......:");
		float n2 = sc.nextFloat();
		System.out.println("Nota 3 .......:");
		float n3 = sc.nextFloat();
		
		float nota1 =(float) ((float) n1*0.20);
		float nota2 =(float) ((float) n2*0.30);
		float nota3 =(float) ((float) n3*0.50);
		
		float promedio = (nota1 + nota2 + nota3);
		//float promedio = (nota1 + nota2 + nota3)/ 3 ;

		System.out.println("Nombre del Alumno:"+nombre);
		System.out.println("Promedio Final...:"+ df.format(promedio));
		
		
	}

}
