package br.com.blacksheep.factory;

public class EmissorEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println(" Enviando por Email a mensagem : ");
		System.out.println(mensagem);

	}

}
