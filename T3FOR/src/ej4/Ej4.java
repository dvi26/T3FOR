package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int numero;
		System.out.println("Introduzca un numero:" );
		Scanner sc = new Scanner(System.in);
		numero=sc.nextInt();
		for(int contador=3;contador<=numero;contador=contador + 3){
			System.out.println(contador);

	}

}}
