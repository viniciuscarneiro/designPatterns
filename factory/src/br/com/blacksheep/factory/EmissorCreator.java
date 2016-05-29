package br.com.blacksheep.factory;

public class EmissorCreator {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor create(int tipo){
		if(SMS == tipo){
			return new EmissorSMS();
		}else if(EMAIL == tipo){
			return new EmissorEmail();
		}else if(JMS == tipo){
			return new EmissorJMS();
		}else{
			throw new IllegalArgumentException("Tipo de emissor não suportado.");
		}
	}
}
