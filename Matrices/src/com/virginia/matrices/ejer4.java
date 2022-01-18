/**
 * 
 */
package com.virginia.matrices;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class ejer4 {

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
		
		
		Matrices.esTriangularSup(matriz);
		System.out.println("");
		

	}

}
