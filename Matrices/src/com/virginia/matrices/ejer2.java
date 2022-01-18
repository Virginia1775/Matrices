/**
 * 
 */
package com.virginia.matrices;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class ejer2 {

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
		Matrices.mostrar_matriz(matriz);
		
		
		boolean escero =Matrices.es_cero(matriz);
		
		if (escero) {
			System.out.println("Son todos ceros");
		}
		else {
			System.out.println("Alguno diferente de cero");
		}
	}
	   
 }
