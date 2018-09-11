package negocio;

public class Caracteristica {

	private float peso;
	private float altura;
	private String cor;
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void exibir() {
		System.out.printf("Peso: %.2f\n", peso);
		System.out.printf("Altura: %.2f\n", altura);
		System.out.printf("Cor: %s\n", cor);
	}
}
