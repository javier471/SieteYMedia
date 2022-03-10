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
		StringBuilder mensaje = new StringBuilder();
		for (int i = 0; i < super.numCartas; i++) {
			if (super.cartas[i].getNumber() <= 10) {
				mensaje.append(super.cartas[i].getNumber());
			} else if (super.cartas[i].getNumber() == 11) {
				mensaje.append("J");
			} else if (super.cartas[i].getNumber() == 12) {
				mensaje.append("Q");
			} else {
				mensaje.append("K");
			}
			mensaje.append(" de "+super.cartas[i].getPalo()+"\n");
		}
		return mensaje.toString();
	}

	
}
