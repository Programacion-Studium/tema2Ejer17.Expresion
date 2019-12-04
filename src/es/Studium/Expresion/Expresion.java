package es.Studium.Expresion;

import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el primer número");
		n1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		n2 = teclado.nextInt();
		System.out.println("Introduzca el tercer número");
		n3 = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado es "+ FuncExpresion(n1, n2, n3));
	}
	public static double FuncExpresion(int a, int b, int c)
	{
			return ((double)((b*b)-(4*a*c))/(double)(2*a));
	}
}
