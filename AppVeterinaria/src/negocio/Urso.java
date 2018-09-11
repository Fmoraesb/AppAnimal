package negocio;

public class Urso extends Animal{

	private Caracteristica caracteristica;

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void exibir() {
		super.exibir();
		caracteristica.exibir();
	}
}
