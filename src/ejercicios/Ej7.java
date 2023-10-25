package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		//variable que representan el numero y su factorial
		int n,calculo=0;
		

		//muestra por pantalla que introduzcas un numero
		System.out.println("Introduce un numero: ");
		
		//introducimos el numero
		n=sc.nextInt();
		
		//le damos el valor de n a la variable que va a ser el resultado de la operacion
		calculo=n;
		
		
		//bucle que hace las multiplicaciones hasta que llegue a 1
		for(int i=n-1;i>0;i--) {
			
			//cada numero se multiplica y se añade al calculo
			calculo*=i;
			
			
		}
		
		//se muestra el mensaje en pantalla del numero
		System.out.println("EL NUMERO FACTORIAL DE "+n+" ES "+calculo);
		
		//cierre de scanner
		sc.close();
	}

}
