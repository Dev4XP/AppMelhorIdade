package negocio;

public class Usuario {
	private String nome;
	private int idade;
	private boolean genero;
	private String estadoCivil;
	private Contato contato;
	
	public void exibir() {
		System.out.printf("Nome: %s\n"
				+ "Idade: %d\n"
				+ "Genero: %s\n",
				nome,
				idade,
				(genero ? "masculino" : "femenino"));
		estadoCivil();
		contato.exibir();
	}
	
	public void estadoCivil() {
		
		switch (estadoCivil) {
		case "1":
			System.out.println("Estado Civil: Solteiro");
			break;
			
		case "2":
			System.out.println("Estado Civil: Casado");
			break;
			
		case "3":
			System.out.println("Estado Civil: Separado");
			break;
			
		case "4":
			System.out.println("Estado Civil: Divorciado");
			break;
			
		case "5":
			System.out.println("Estado Civil: Viúvo");
			break;

		default:
			System.out.println("Erro: nao existe essa opcao");
			break;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
