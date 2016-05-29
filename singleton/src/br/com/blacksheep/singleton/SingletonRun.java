package br.com.blacksheep.singleton;

public class SingletonRun {

	public static void main(String[] args) {
		Window window = Window.getInstance();
		System.out.println("Hash Code:" + window.hashCode());
		Window window2 = Window.getInstance();
		System.out.println("Hash Code:" + window2.hashCode());

		if (window.hashCode() == window2.hashCode()) {
			System.out.println("Hash Code are equals!");
		}

		String singleton =
				"O singleton é um padrão de projetos que é utilizado para garantir que uma determinada Classe seja criada em memória uma unica vez, \n com visibilade e acesso global dessa única instância na aplicação";
		System.out.println(singleton);
	}
}
