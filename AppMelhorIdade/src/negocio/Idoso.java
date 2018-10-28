package negocio;

public class Idoso extends Usuario {
	private boolean necessidadesEspeciais;
	
	public Idoso(String nome, int idade, boolean genero, int estadoCivil, Contato contato, Endereco endereco, boolean necessidadesEspeciais) {
		super(nome, idade, genero, estadoCivil, contato, endereco);
		this.necessidadesEspeciais = necessidadesEspeciais;
		
	}
	
	public void exibir() {
		super.exibir();
		System.out.printf("Necessidades Especiais? %s",
				necessidadesEspeciais ? "sim\n" : "n�o\n");			
	}

	public boolean isNecessidadesEspeciais() {
		return necessidadesEspeciais;
	}

	public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
		this.necessidadesEspeciais = necessidadesEspeciais;
	}

	

}
