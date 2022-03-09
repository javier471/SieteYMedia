package com.jacaranda.baraja;

public class BarajaEspanola extends Baraja{

	private static final int CARTAS_ESPANOLA=40;
	public BarajaEspanola() throws CartaException {
		super(CARTAS_ESPANOLA);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String generaPalo() {
		String resul;
		int num = (int) (Math.random() * 4);
		resul = PalosBarajaEspanola.values()[num].toString();
		return resul;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
