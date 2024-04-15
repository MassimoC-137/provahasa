package it.prova.provahasa.test;

import it.prova.provahasa.model.Indirizzo;
import it.prova.provahasa.model.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		
		Persona per1 = new Persona("Dan", "Car", 55, new Indirizzo("Roma", "Casa", 137)); 
		Persona per2 = new Persona("Tau", "Bou", 28, new Indirizzo("Tehran", "Acqua", 69)); 
		Persona per3 = new Persona("Gio", "Pes", 33, new Indirizzo("Roma", "Savina", 52)); 
		Persona per4 = new Persona("Luk", "Dip", 34, new Indirizzo("Pechino", "Ravioli", 12)); 
		Persona per5 = new Persona("Vit", "Dal", 33, new Indirizzo("Monopoli", "Soldi", 22)); 
		Persona per6 = new Persona("Pep", "Mol", 33, new Indirizzo("Pozzuoli", "Porto", 56)); 
		
		Persona meIo = new Persona("Max", "Car", 29, new Indirizzo("Roma", "Casa", 137)); 
		
		Persona[] amiciLiv = {per1, per2, per3, per4, per5, per6}; 
		
		
		
		
//		System.out.println(meIo.abitaA("Roma"));
//		
//		System.out.println(meIo.haAlmenoUnConcittadino(amiciLiv));
//
//		System.out.println(meIo.sonoTuttiConcittadiniPiuAnzianiDiMe(amiciLiv));
//		
		
		
		
		
		
	}

}
