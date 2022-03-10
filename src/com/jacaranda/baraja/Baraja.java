package com.jacaranda.baraja;

import java.util.Arrays;

public abstract class Baraja implements Repartible{

	protected int numCartas;
	private int siguiente;
	protected Carta[] cartas;

	public Baraja(int num) throws CartaException {
		super();
		this.numCartas = num;
		this.siguiente = 0;
		this.cartas = new Carta[numCartas];
		barajar();

	}

	public void barajar() throws CartaException {
		int i = 0;
		while (i < numCartas) {
			Carta c = new Carta(generaNumero(), generaPalo());
			boolean flag = false;
			for (int j = 0; j < i && !flag; j++) {
				if (cartas[j].equals(c)) {
					flag = true;
				}
			}
			if (!flag) {
				cartas[i] = c;
				i++;
			}
		}
		siguiente = 0;
	}

	public Carta getSiguiente() throws CartaException {
		Carta resul = new Carta(cartas[siguiente].getNumber(), cartas[siguiente].getPalo());
		siguiente++;
		return resul;
	}

	protected abstract String generaPalo();


	private int generaNumero() {
		int num = (int) (((Math.random() * numCartas) /4) +1);
		return num;
	}

	@Override
	public String toString() {
		String resul="";
		for(int i=0;i<numCartas;i++) {
			resul+=cartas[i]+"\n";
		}
		return resul;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cartas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baraja other = (Baraja) obj;
		return Arrays.equals(cartas, other.cartas);
	}

}
