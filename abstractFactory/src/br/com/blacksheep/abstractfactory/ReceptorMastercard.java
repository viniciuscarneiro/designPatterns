package br.com.blacksheep.abstractfactory;

public class ReceptorMastercard implements Receptor {

	@Override
	public String recebe() {
		System.out.println(" Recebendo mensagem da Mastercard.");
		return " Mensagem da Mastercard ";
	}
}