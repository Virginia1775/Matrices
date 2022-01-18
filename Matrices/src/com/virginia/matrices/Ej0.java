/**
 * 
 */
package com.virginia.matrices;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class Ej0 {

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
		System.out.println("cuantas columnas quieres");
		Matrices.pedir_matriz(matriz);
		
		System.out.println("tu matriz es:");
		Matrices.mostrar_matriz(matriz);
		
		
		
		
		
		
		
		
		
	}

}
