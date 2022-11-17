package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila < 1 || fila > 7) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		} else {
			this.fila = fila;
		}
	}

	public char getColumna() {
		return columna;
	}

	public Posicion(int fila, char columna) {
		this.setFila(fila);
		this.setColumna(columna);
	}

	public void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		} else {
			this.columna = columna;
		}
	}

	public Posicion(Posicion posicion) {

		if (posicion == null) {
			throw new IllegalArgumentException("POSICION_NO_ESPERADA");
		} else {
			this.setFila(posicion.getFila());
			this.setColumna(posicion.getColumna());
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna + "";
	}

}
