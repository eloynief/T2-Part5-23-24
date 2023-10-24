package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		int n=200,par=1;
		
		for(int i=1;i<=n;i++) {
			
			if(par%2==0) System.out.println(par);
			
			
			par++;
			
		}
		
		
		//cierre de scanner
		sc.close();
	}

}
