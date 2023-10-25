package ej9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		int numero;
		int resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero" );
		numero=sc.nextInt();
		
		for(numero=numero;!(numero<2);numero--){
			resto=numero--%numero;
			
			if(resto==0){
				System.out.println("El numero no es primo" );
				break;
			}
				
			if (resto!=0){
			System.out.println("El numero es primo" );
			
			
				
		}	
			}
	}}		
			

	
	

		

	
	

	
		



				
	
				

				
	
				
			
				

	


