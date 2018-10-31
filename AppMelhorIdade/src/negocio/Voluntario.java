package negocio;

public class Voluntario extends Usuario {
	private boolean voluntario;
	
	public Voluntario(String nome, int idade, boolean genero, int estadoCivil, Contato contato, Endereco endereco, boolean voluntario) {
		super(nome, idade, genero, estadoCivil, contato, endereco);
		this.voluntario = voluntario;
	}


	public void exibir() {
		super.exibir();
		System.out.printf("Voluntario: %s\n", 
				(voluntario ? "sim" : "não" ));
	}

	public boolean isVoluntario() {
		return voluntario;
	}


	public void setVoluntario(boolean voluntario) {
		this.voluntario = voluntario;
	}
}
