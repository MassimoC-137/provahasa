package it.prova.provahasa.model;

public class Spettatore {

	private String nome; 
	private String cognome; 
	private String numeroCartaDiCredito; 
	private Biglietto biglietto; 
	
	public Spettatore() {
		
	}
	
	public Spettatore(String nome, String cognome, String numeroCartaDiCredito, Biglietto biglietto) {
		
		this.nome = nome; 
		this.cognome = cognome; 
		this.numeroCartaDiCredito = numeroCartaDiCredito; 
		this.biglietto = biglietto; 
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
	
	public String getNumeroCartaDiCredito() {
		return numeroCartaDiCredito; 
	}
	
	public void setNumeroCartaDiCredito(String numeroCartaDiCredito) {
		this.numeroCartaDiCredito = numeroCartaDiCredito; 
	}
	
	public Biglietto getBiglietto() {
		return biglietto; 
	}
	
	public void setBiglietto(Biglietto biglietto) {
		this.biglietto = biglietto; 
	}
	
	public double incassoDeiPagantiNellaMiaFila(Spettatore[] elencoDeiPagantiTotali) {
		
		double incassoTotaleFila = 0; 
		for (int i = 0; i < elencoDeiPagantiTotali.length; i++) {
			if (elencoDeiPagantiTotali[i].getBiglietto().getLetteraFila() == this.biglietto.getLetteraFila()) {
				incassoTotaleFila = incassoTotaleFila + elencoDeiPagantiTotali[i].getBiglietto().getPrezzo() ;
			}	
		}
		return incassoTotaleFila;
	}
	
	public int numeroSpettatoriDelMioStessoSpettacolo(Spettatore[] elencoDeiPagantiTotali) {
		
		int quantiSpettatori = 0; 
		for (int i = 0; i < elencoDeiPagantiTotali.length; i++) {
			if (elencoDeiPagantiTotali[i].getBiglietto().getNomeSpettacolo() == this.biglietto.getNomeSpettacolo()) {
				quantiSpettatori ++;
			}
		}
		return quantiSpettatori;
	}
	
	public boolean numeroSpettatoriDelMioStessoSpettacoloSuperaAspettativa(Spettatore[] paganti, int aspettativa) {
		
		int salaInsieme = 0; 
		for (int i = 0; i < paganti.length; i++) {
			if (paganti[i].getBiglietto().getNomeSpettacolo() == this.biglietto.getNomeSpettacolo()) {
				salaInsieme ++; 
			}
			if(salaInsieme >= aspettativa) { 
				return true; 
			}
		}
		return false; 
	}
}





