package ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		
		//representa el numero que quieres introducir
		int n,numIntroducido,esPrimo=0;
		
		
		
		//
		System.out.println("Introduce un numero: ");
		
		//
		n=sc.nextInt();
		

		//if numIntroducido/i=0
		
		//
		for(int i=2;i<=n;i++) {
			
			//la i es el divisor que aumenta
			if (n%i==0) {
				esPrimo++;
			}
			
			
		}
		
		if(esPrimo==1||n==1) {

			System.out.println("Es primo");
			 
			
		}
		else {
			System.out.println("No es primo");
		}
		
		
		//cierre de scanner
		sc.close();
		
	}

}
