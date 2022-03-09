package com.jacaranda.baraja;

public class BarajaInglesa extends Baraja{
	
	public BarajaInglesa() throws CartaException {
		super(52);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String generaPalo() {
		String resul;
		int num = (int) (Math.random() * 4);
		resul = PalosBarajaInglesa.values()[num].toString();
		return resul;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
