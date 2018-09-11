package teste;

import negocio.Cachorro;
import negocio.Caracteristica;
import negocio.Gato;
import negocio.Urso;

public class TestaAnimal {

	public static void main(String[] args) {
		
		String[] donosGato = {"Tom", "Jerry"};

		Gato gato = new Gato();
		gato.setIdade(5);
		gato.setNome("Gargamel");
		gato.setDono(donosGato);
		gato.setEhCastrado(true);
		gato.exibir();
		
		Caracteristica caractUrso = new Caracteristica();
		caractUrso.setAltura(2.3f);
		caractUrso.setCor("Branca");
		caractUrso.setPeso(100);
		
		String[] donosUrso = {"Marsha"};
		
		Urso urso = new Urso();
		urso.setNome("Tobe");
		urso.setIdade(8);
		urso.setDono(donosUrso);
		urso.setCaracteristica(caractUrso);
		urso.exibir();

		String donosOlga[] =  {"João","Maria"};
		
		Cachorro olga = new Cachorro();
		olga.setNome("Olga");
		olga.setIdade(10);
		olga.setDono(donosOlga);
		olga.setRaca("Pug");
		
		Caracteristica caractOlga = new Caracteristica();
		caractOlga.setPeso(15);
		caractOlga.setAltura(15);
		caractOlga.setCor("Marrom");
		olga.setCaracteristica(caractOlga);
		olga.exibir();
		
		String donosRonda[] =  {"Hugo", "José", "Luís"};
		
		Cachorro ronda = new Cachorro();
		ronda.setNome("Ronda");
		ronda.setIdade(2);
		ronda.setDono(donosRonda);
		ronda.setRaca("Rottweiler");
		
		Caracteristica caractRonda = new Caracteristica();
		caractRonda.setPeso(40);
		caractRonda.setAltura(50);
		caractRonda.setCor("Preta");
		ronda.setCaracteristica(caractRonda);
		ronda.exibir();
	}

}
