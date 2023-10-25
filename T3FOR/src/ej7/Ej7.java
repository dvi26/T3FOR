package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int resultado=1;
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero:" );
		numero=sc.nextInt();
		for(numero=numero;!(numero<1);numero--){
			resultado=numero*resultado;	

	}
		System.out.println(resultado );
		sc.close();
}}
