package com.jacaranda.baraja;

import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws CartaException {
		// TODO Auto-generated method stub

		BarajaInglesa b1=new BarajaInglesa();
		b1.barajar();
		System.out.println(b1);


		
	}

}
