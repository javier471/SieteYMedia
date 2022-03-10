package com.jacaranda.baraja;

public class BarajaEspanola extends Baraja {

	private static final int CARTAS_ESPANOLA = 40;

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
		StringBuilder mensaje = new StringBuilder();
		for (int i = 0; i < super.numCartas; i++) {
			if (super.cartas[i].getNumber() <= 7) {
				mensaje.append(super.cartas[i].getNumber());
			} else if (super.cartas[i].getNumber() == 8) {
				mensaje.append("Sota");
			} else if (super.cartas[i].getNumber() == 9) {
				mensaje.append("Caballo");
			} else {
				mensaje.append("Rey");
			}
			mensaje.append(" de "+super.cartas[i].getPalo()+"\n");
		}
		return mensaje.toString();
	}

}
