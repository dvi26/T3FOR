package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int numero;
		System.out.println("Introduzca un numero:" );
		Scanner sc = new Scanner(System.in);
		numero=sc.nextInt();
		for(int contador=1;contador<=numero;contador++){
			System.out.println(contador);
			
			
		}
		sc.close();
	}

}
