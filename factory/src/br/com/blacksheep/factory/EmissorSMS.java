package br.com.blacksheep.factory;

public class EmissorSMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println(" Enviando por SMS a mensagem : ");
		System.out.println(mensagem);

	}

}
