package it.prova.provahasa.model;

public class Persona {

	private String nome; 
	private String cognome; 
	private int eta; 
	private Indirizzo indirizzo; 
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, int eta, Indirizzo indirizzo) {
		this.nome = nome; 
		this.cognome = cognome; 
		this.eta = eta; 
		this.indirizzo = indirizzo; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getCognome() {
		return cognome; 
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome; 
	}
	
	public int getEta() {
		return eta; 
	}
	
	public void setEta(int eta) {
		this.eta = eta; 
	}
	
	public Indirizzo getIndirizzo() {
		return indirizzo; 
	}
	
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo; 
	}
	
//	+++++++++++++++++++++++++++++++++++++++++++++
	
	public boolean abitaA(String citta) {
		
		if (this.indirizzo.getCitta().equals(citta)) {
			return true; 
		}
		return false; 
	}
	
//	+++++++++++++++++++++++++++++++++++++++++++++

	public boolean haAlmenoUnConcittadino(Persona[] abitanti) {
		
		for (int i = 0; i < abitanti.length; i++) {
			if (this.indirizzo.getCitta().equals(abitanti[i].getIndirizzo().getCitta())) {
				return true; 
			}
		}
		return false; 
	}
	
//	+++++++++++++++++++++++++++++++++++++++++++++

	public boolean sonoTuttiConcittadiniPiuAnzianiDiMe(Persona[] abitanti) {
		
		int concittadini = 0; 
		for (int i = 0; i < abitanti.length; i++) {
			if (this.indirizzo.getCitta().equals(abitanti[i].getIndirizzo().getCitta()) 
					&& this.eta < abitanti[i].getEta()) {
				concittadini ++; 
			}
		}
		if (abitanti.length == concittadini) {
			return true;
		} else {
			return false;
		}
	}
	
}














