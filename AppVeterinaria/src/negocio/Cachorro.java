package negocio;

public class Cachorro extends Animal {

	private Caracteristica caracteristica;
	private String raca;
	
	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void exibir() {
		super.exibir();
		System.out.println("*********Caracter�sticas do Cachorro*********");
		caracteristica.exibir();
		System.out.printf("Ra�a: %s\n", raca);
	}
}
