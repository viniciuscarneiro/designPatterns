package br.com.blacksheep.abstractfactory;

public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		System.out.println(" Recebendo mensagem da Visa .");
		return " Mensagem da Visa ";
	}
}