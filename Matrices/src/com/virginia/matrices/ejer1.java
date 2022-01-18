/**
 * 
 */
package com.virginia.matrices;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class ejer1 {

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
		
		for (int i=0; i< matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				matriz[i][j]=5;
			}
		}
		
		System.out.println("La matriz inicilizada es");
		Matrices.mostrar_matriz(matriz);

	}

}
