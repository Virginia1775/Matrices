/**
 * 
 */
package com.virginia.matrices;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class Matrices {
		public static void pedir_matriz(int matriz[][]) {
			Scanner entrada = new Scanner(System.in);
			for (int i=0; i< matriz.length; i++) {
				for(int j=0; j<matriz[0].length; j++) {
					System.out.printf("introduce el elemento (%d,%d):  ", i,j);
					matriz[i][j]=entrada.nextInt();
				}
			}
		}
	
public static void mostrar_matriz (int matriz[][]) {
	for (int i=0; i< matriz.length; i++) {
		for(int j=0; j<matriz[0].length; j++) {
			System.out.printf("%3d", matriz[i][j]);
		}
		System.out.println();
}
}
}