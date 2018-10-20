package negocio;

public class Idoso extends Usuario {
	private boolean necessidadesEspeciais;
	
	public void exibir() {
		super.exibir();
		System.out.printf("Necessidades Especiais?\n%s",
				necessidadesEspeciais ? "sim\n" : "não\n");

				
	}

	public boolean isNecessidadesEspeciais() {
		return necessidadesEspeciais;
	}

	public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
		this.necessidadesEspeciais = necessidadesEspeciais;
	}

	

}
