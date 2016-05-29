package br.com.blacksheep.abstractfactory;

public class ReceptorCreator {

	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create(int tipo) {
		if (VISA == tipo) {
			return new ReceptorVisa();
		} else if (MASTERCARD == tipo) {
			return new ReceptorMastercard();
		} else {
			throw new IllegalArgumentException("Tipo de Receptor não suportado.");
		}
	}
}
