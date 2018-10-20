package teste;

import negocio.Contato;
import negocio.Idoso;


public class TestaIdoso {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setTelefone("123456789");
		contato.setEmail("idoso@gmail.com");
		contato.setCelular("9912345678");

		Idoso idoso = new Idoso();
		idoso.setNecessidadesEspeciais(false);
		idoso.setEstadoCivil("2");
		idoso.setIdade(60);
		idoso.setNome("leandro");
		idoso.setGenero(true);
		idoso.setContato(contato);
		idoso.exibir();
	}
}
