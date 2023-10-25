package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int numero=0;
		int suma=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca diez numeros:" );
		for(int contador=0;contador<10;contador++){
			numero=sc.nextInt();
			if(numero%3==0) {
			suma=suma+numero;	

	}
		

}
		System.out.println(suma );
		sc.close();

	}}
