package teste;

import negocio.Endereco;

public class TestaEndereco {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Amaral Peixoto", 470, "Centro", "Niter�i", "RJ");
		endereco.exibir();
	}
}
