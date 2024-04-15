package it.prova.provahasa.model;

public class Biglietto {

	private String nomeSpettacolo;
	private char letteraFila;
	private int numeroPosto;
	private double prezzo;

	public Biglietto() {

	}

	public Biglietto(String nomeSpettacolo, char letteraFila, int numeroPosto, double prezzo) {

		this.nomeSpettacolo = nomeSpettacolo;
		this.letteraFila = letteraFila;
		this.numeroPosto = numeroPosto;
		this.prezzo = prezzo;
	}

	public String getNomeSpettacolo() {
		return nomeSpettacolo;
	}

	public void setNomeSpettacolo(String nomeSpettacolo) {
		this.nomeSpettacolo = nomeSpettacolo;
	}

	public char getLetteraFila() {
		return letteraFila;
	}

	public void setLetteraFila(char letteraFila) {
		this.letteraFila = letteraFila;
	}

	public int getNumeroPosto() {
		return numeroPosto;
	}

	public void setNumeroPosto(int numeroPosto) {
		this.numeroPosto = numeroPosto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public static Biglietto trovaIlPiuEconomico(Biglietto[] elencoBiglietti) {

		Biglietto piuEconomico = elencoBiglietti[0];
		for (int i = 1; i < elencoBiglietti.length; i++) {
			if (elencoBiglietti[i].getPrezzo() < piuEconomico.getPrezzo()) {
				piuEconomico = elencoBiglietti[i];
			}
		}
		return piuEconomico;
	}

	public boolean bigliettoAncoraInvenduto(Biglietto[] elencoBigliettiInvenduti) {
		
		for (int i = 0; i < elencoBigliettiInvenduti.length; i++) {
			if (this.getNomeSpettacolo() == elencoBigliettiInvenduti[i].getNomeSpettacolo() 
					&& this.getLetteraFila() == elencoBigliettiInvenduti[i].getLetteraFila()
					&&this.getNumeroPosto() == elencoBigliettiInvenduti[i].getNumeroPosto()) {
				return true; 
			}
		}
		return false; 
	}
}
