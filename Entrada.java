
package com.mycompany.ejercicio2;
import java.util.Scanner;

public class Entrada {
    private Scanner entrada = new Scanner(System.in);

	public int obtenerEntero(String msg) {
		boolean loop = true;
		int valor=0;
		String teclado;
		
		do {
			try {
				System.out.println(msg);
				teclado = entrada.nextLine();
				valor = Integer.parseInt(teclado);
				loop = false;
			} catch (Exception e) {
				System.out.println("El valor introducido debe ser un numero entero!!!");
			}
		} while (loop);
		return valor;
	}

	public float obtenerFloat(String msg) {
		boolean loop = true;
		float valor=0;
		String teclado;
		
		do {
			try {
				System.out.println(msg);
				teclado = entrada.nextLine();
				valor = Float.parseFloat(teclado);
				loop = false;
			} catch (Exception e) {
				System.out.println("El valor introducido debe ser un numero decimal: ");
			}
		} while (loop);
		return valor;
	}

	public String obtenerString(String msg) {
		System.out.println(msg);
		return entrada.nextLine();
	}

	public char obtenerChar(String msg) {
		System.out.println(msg);
		return entrada.nextLine().charAt(0);
	}

}

