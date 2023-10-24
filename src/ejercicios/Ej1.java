package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		
		int n;
		
		
		System.out.println("Introduce un numero: ");
		
		//
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		//cierre de scanner
		sc.close();
	}

}
