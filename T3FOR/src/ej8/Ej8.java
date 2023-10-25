package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int numero=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca diez numeros:" );
		for(int contador=1;contador<6;contador++){
			numero=sc.nextInt();
			
			if(numero<5 && !(numero<0)) {
				System.out.println("Está suspenso" );
				
			}
				else if (numero>=5 && !(numero>10)){
				System.out.println("Está aprobado" );
	
				}
			
				
			

		}
		sc.close();
	
	}
	
}


	
