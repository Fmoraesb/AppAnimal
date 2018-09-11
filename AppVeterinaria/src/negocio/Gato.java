package negocio;

public class Gato extends Animal {

	private boolean ehCastrado;

	public boolean isEhCastrado() {
		return ehCastrado;
	}
	public void setEhCastrado(boolean ehCastrado) {
		this.ehCastrado = ehCastrado;
	}

	public void exibir() {
		super.exibir();
		System.out.println("*********Características do Gato*********");	
		System.out.printf("Castrado: %s \n",
				ehCastrado ? "Sim" : "Não"
				);
	}
}
