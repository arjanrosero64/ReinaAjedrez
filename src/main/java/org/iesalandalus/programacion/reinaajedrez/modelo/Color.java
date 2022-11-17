package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
BLANCO("Blanco"),
NEGRO("Negro");

	
	public String cadenaAMostrar;
	
	
	private Color (String cadenaAMostrar ){
		this.cadenaAMostrar= cadenaAMostrar;
	}
	
	
		
	

	public String toString() {
		return cadenaAMostrar;
	}
}
