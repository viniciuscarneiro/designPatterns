package br.com.blacksheep.abstractfactory;

public class EmissorCreator {

	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Emissor create(int tipo) {
		if (VISA == tipo) {
			return new EmissorVisa();
		} else if (MASTERCARD == tipo) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado.");
		}
	}
}
