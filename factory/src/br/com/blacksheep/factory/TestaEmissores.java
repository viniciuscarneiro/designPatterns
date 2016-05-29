package br.com.blacksheep.factory;

public class TestaEmissores {

	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("Estudando design patterns");
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia("Estudando design patterns");
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("Estudando design patterns");
	}
}
