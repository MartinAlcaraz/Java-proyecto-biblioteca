package ar.com.bytebank;

import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestLibreria {

	public static void main(String[] args) {
		
		CuentaCorriente c1 = new CuentaCorriente(1, 220);
		c1.depositar(200);
		
		System.out.println(c1.getSaldo());
		
		
	}
}
