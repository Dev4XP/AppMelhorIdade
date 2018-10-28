package teste;

import negocio.Contato;

public class TestaContato {
	public static void main(String[] args) {
		Contato contato = new Contato("123456789", "contato@contato.com", "9876543210");
		contato.exibir();
	}
}
