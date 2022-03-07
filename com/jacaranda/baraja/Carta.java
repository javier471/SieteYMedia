package com.jacaranda.baraja;

import java.util.Objects;

public class Carta {

	private int number;
	private String palo;

	public Carta(int number, String palo) throws CartaException {
		super();
		if (number <= 0 || number > 10) {
			throw new CartaException("No se puede crear una carta con ese numero");
		}
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
		String mensaje = "";
		if (getNumber() == 8) {
			mensaje = "Carta [valor=" + " sota" + ", palo=" + palo + "]";
		} else if (getNumber() == 9) {
			mensaje = "Carta [valor=" + " caballo" + ", palo=" + palo + "]";
		} else if (getNumber() == 10) {
			mensaje = "Carta [valor=" + " rey" + ", palo=" + palo + "]";

		} else {
			mensaje = "Carta [valor=" + number + ", palo=" + palo + "]";
		}
		return mensaje;
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
