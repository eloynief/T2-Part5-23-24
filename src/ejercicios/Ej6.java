package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		int n,sumaImpares=0;
		
		
		for(int i=0;i<10;i++) {
			
			//
			System.out.println("Introduce un numero impar: ");
			
			//
			n=sc.nextInt();
			if(n%2==1) {
				sumaImpares+=n;
			}else {
				i--;
			}
			
			
		}
		//cierre de scanner
		sc.close();
	}

}
