package ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		


		//variable que representan el numero
		int nota,cantidadSuspensos=0;
		

		//muestra por pantalla que introduzcas un numero
		System.out.println("Introduce un numero: ");
		
		//introducimos el numero
		nota=sc.nextInt();
		

		
		for(int i=0;i<5;i++) {
			
			//
			System.out.println("Introduce la nota: ");
			
			//
			nota=sc.nextInt();
			
			//si la nota es menor de 5
			if(nota<5) {
				//aumenta la cantidad de suspensos
				cantidadSuspensos++;
			}
			
		}
		
		//por cada suspenso que haya, imprime que ha suspendido
		System.out.println("Hay "+cantidadSuspensos+" suspensos");
		
		
		//cierre de scanner
		sc.close();
	}

}
