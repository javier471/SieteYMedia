package com.jacaranda.baraja;

import java.util.Objects;

public class Carta {

	private int number;
	private String palo;

	public Carta(int number, String palo) throws CartaException {
		super();
		this.number = number;
		this.palo = palo;
	}

	public int getNumber() {
		return number;
	}

	public String getPalo() {
		return palo;
	}

	public double getValor() {
		double resul = 0;
		if (this.number > 7) {
			resul = 0.5;
		} else {
			resul = number;
		}
		return resul;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}

	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}

	@Override
	protected Object clone() {
		
		Carta resultado = null;
		try {
			resultado = new Carta(getNumber(),getPalo());
		} catch (CartaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	
		
	

}
