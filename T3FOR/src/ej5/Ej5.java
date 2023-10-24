package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int numero;
		int media;
		int suma=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca diez numeros:" );
		for(int contador=0;contador<10;contador++){
			numero=sc.nextInt();
			suma=suma+numero;	
	}
	
		media=suma/10;
		System.out.println("La media es " + media );
		sc.close();
}}
