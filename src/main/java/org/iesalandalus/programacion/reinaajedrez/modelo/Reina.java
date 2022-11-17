package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	Color color;
	Posicion posicion;

	
	

	public Reina() {
		this.color = Color.BLANCO;
		this.posicion = new Posicion(1, 'd');

	}

	public Reina(Color color) {
		if (color == null) {
			throw new NullPointerException();

		}
		if (color == Color.BLANCO) {
			this.posicion = new Posicion(1, 'd');
			this.color = Color.BLANCO;
		}
		if (color == Color.NEGRO) {
			this.posicion = new Posicion(8, 'd');
			this.color = Color.NEGRO;
		}

	}

	public Color getColor() {
		return color;

	}

	private void setColor(Color color) {
		this.color = color;
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void mover(Direccion direccion, int pasos) {
		if (pasos < 1 || pasos > 8) {
			throw new IllegalArgumentException("Los pasos estan mal");
		}
		if (direccion.equals(null)) {
			throw new IllegalArgumentException("La direccion es nula");
		} 
		

		switch (direccion.toString()) {
		
		
		
		case "NORTE":
			this.posicion = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
			break;
		case "NORESTE":
			this.posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + pasos));
			break;
		case "ESTE":
			this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos));
			break;
		case "SURESTE":
			this.posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + pasos));
			break;
		case "SUR":
			this.posicion = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
			break;
		case "SUROESTE":
			this.posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - pasos));
			break;
		case "OESTE":
			this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos));
			break;
		case "NOROESTE":
			this.posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - pasos));
			break;
			
		}

	}

	@Override
	public String toString() {
		return "Reina [color=" + color + ", posicion=" + posicion + ", reinaBlanca=" + color + ", reinaNegra="
				+ color + ", posiciondefectoBlanca=" + posicion + ", posiciondefectoNegra="
				+ posicion + "]";
	}

}
