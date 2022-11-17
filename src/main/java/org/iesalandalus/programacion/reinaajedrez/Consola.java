package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {
	}

	public void mostrarMenu() {
		System.out.println("1.Crear reina por defecto.");
		System.out.println("2.Crear reina eligiendo el color.");
		System.out.println("3.mover.");
		System.out.println("4.Salir.");

	}

	public int elegirOcionMenu() {
		System.out.println("Elige una opcion del menu.");
		int opcion1 = Entrada.entero();
		return opcion1;
	}

	public Color elegirColor() {
		int color;
		System.out.println("Elige un color.");
		System.out.println("1 BLANCO.");
		System.out.println("2 NEGRO.");
		do {
			color = Entrada.entero();

			if (color == 1) {
				return Color.BLANCO;
			} else {
				return Color.NEGRO;
			}

		} while (color != 1 || color != 2);

	}

	public void mostrarMenuDirecciones() {
		System.out.println("1.Norte");
		System.out.println("2.Noreste");
		System.out.println("3.Este.");
		System.out.println("4.Sureste.");
		System.out.println("5.Sur.");
		System.out.println("6.Suroeste.");
		System.out.println("7.Oeste.");
		System.out.println("8.Noroeste.");

	}

	public Direccion elegirDirecccion() {
		int direccion;
		Direccion direccion1 = null;

		System.out.println("Elegir dirección");
		do {
			direccion = Entrada.entero();
			switch (direccion) {
			case 1: {
				direccion1 = Direccion.NORTE;
				break;
			}
			case 2: {
				direccion1 = Direccion.NORESTE;
				break;
			}
			case 3: {
				direccion1 = Direccion.ESTE;
				break;
			}
			case 4: {
				direccion1 = Direccion.SURESTE;
				break;
			}
			case 5: {
				direccion1 = Direccion.SUR;
				break;
			}
			case 6: {
				direccion1 = Direccion.SUROESTE;
				break;
			}
			case 7: {
				direccion1 = Direccion.OESTE;
				break;
			}
			case 8: {
				direccion1 = Direccion.NOROESTE;
				break;
			}
			}
			return direccion1;

		} while (direccion < 1 || direccion > 8);
	}

	public int elegirPasos() {
		System.out.println("Elige el número de pasos a mover.");
		int numpasos;
		numpasos = Entrada.entero();
		return numpasos;
	}
	
	public void desperdirse() {
		System.out.println("Hasta la proxima.");
	}
	
}
