package negocio;

public class Animal {

	private String nome;
	private int idade;
	private String[] dono;
	
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
		
	public String[] getDono() {
		return dono;
	}
	public void setDono(String[] dono) {
		this.dono = dono;
	}

	public void exibir() {
		System.out.println("*********Informações Gerais do Animal*********");
		System.out.printf("Nome do Animal: %s\n", nome);
		System.out.printf("Idade do Animal: %d\n", idade);
		this.exibirDonos();	
	}
	
	private void exibirDonos() {
		System.out.println("*********Informações do(s) Dono(s) do Animal*********");
		System.out.print("Dono(s): ");
		for(String dono: dono) {
			System.out.printf("%s \n", dono);
		}
	}
}
