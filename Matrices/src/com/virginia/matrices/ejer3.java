/**
 * 
 */
package com.virginia.matrices;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class ejer3 extends Matrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("cuantas filas quieres");
		int filas = entrada.nextInt();
		System.out.println("cuantas columnas quieres");
		int columnas = entrada.nextInt();
		
		int matriz[][]= new int [filas][columnas];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("introduce un número:");
		int a= entrada.nextInt();
		
		int veces = Matrices.es_igual_a(matriz, a);
		System.out.printf("El numero %d se repite %d veces:", a,veces);
		

	}

}
