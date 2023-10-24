package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables que representan
		int n,divisor=0,total=0,media;
		
		
		
		//for que se repite las 10 veces
		for(int i=0;i<10;i++) {
			
			//nos pide ekl numero
			System.out.println("Introduce un numero: ");
			
			//se introduce el numero
			n=sc.nextInt();
			
			//el numero se añade al total
			total+=n;
			
			//se incrementa la media
			divisor++;
			
			
		}
		
		//se calcula el total con la media
		media=total/divisor;
		
		//cierre de scanner
		sc.close();
	}

}
