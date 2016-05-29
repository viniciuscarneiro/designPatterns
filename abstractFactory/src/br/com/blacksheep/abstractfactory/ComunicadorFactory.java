package br.com.blacksheep.abstractfactory;

public interface ComunicadorFactory {

	Emissor createEmissor();

	Receptor createReceptor();
}
