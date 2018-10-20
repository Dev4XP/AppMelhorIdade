package teste;

import negocio.Contato;
import negocio.Voluntario;

public class TestaVoluntario {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setTelefone("987654321");
		contato.setEmail("tamyidosa@gmail.com");
		contato.setCelular("9987654321");
		
		Voluntario voluntario = new Voluntario();
		voluntario.setGenero(false);
		voluntario.setEstadoCivil(3);
		voluntario.setIdade(42);
		voluntario.setNome("tamy");
		voluntario.setVoluntario(true);
		voluntario.setContato(contato);
		voluntario.exibir();
		
	
	}
}
