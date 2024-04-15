package it.prova.provahasa.test;

import it.prova.provahasa.model.Biglietto;
import it.prova.provahasa.model.Spettatore;

public class TestSpettatore {

	public static void main(String[] args) {
		
		Spettatore spet1 = new Spettatore("adt", "bnrhe", "123456789134", new Biglietto("abba", 'e', 2, 12.5)); 
		Spettatore spet2 = new Spettatore("pier", "nfppr", "987655678978", new Biglietto("abba", 'e', 4, 11.6)); 
		Spettatore spet3 = new Spettatore("paurf", "dneo", "234569871562", new Biglietto("horro", 't', 1, 10.8)); 
		Spettatore spet4 = new Spettatore("ofhe", "dppofj", "167098723453", new Biglietto("horro", 't', 6, 9.9)); 
		Spettatore spet5 = new Spettatore("bhfjri", "bdep", "654367896438", new Biglietto("abba", 'f', 2, 15.5)); 
		
		Biglietto tick1 = new Biglietto("abba", 'f', 2, 12.5); 
		Biglietto tick2 = new Biglietto("abba", 'e', 6, 11.6); 
		Biglietto tick3 = new Biglietto("horro", 's', 1, 10.8); 
		Biglietto tick4 = new Biglietto("horro", 'u', 6, 9.9); 
		Biglietto tick5 = new Biglietto("abba", 'f', 2, 15.5); 
		Biglietto tick6 = new Biglietto("horro", 'w', 8, 7.8); 
		Biglietto tick7 = new Biglietto("horro", 'w', 9, 8.9); 
		
		Spettatore[] elencoDeiPagantiTotali = {spet1, spet2, spet3, spet4, spet5}; 
		
		Biglietto [] tuttiBigliettiInvenduti = {tick1, tick2, tick3, tick4, tick5, tick6, tick7};
		
		
		Spettatore ioSpet = new Spettatore("Massimo", "Cara", "4030123456789012", new Biglietto("abba", 'f', 0, 5.0)); 
		Biglietto mioTick = new Biglietto("abba", 'f', 2, 5.0); 
		
		
		
//		System.out.println(ioSpet.incassoDeiPagantiNellaMiaFila(elencoDeiPagantiTotali));
//		
//		System.out.println(ioSpet.numeroSpettatoriDelMioStessoSpettacolo(elencoDeiPagantiTotali));
//		
//		System.out.println(ioSpet.numeroSpettatoriDelMioStessoSpettacoloSuperaAspettativa(elencoDeiPagantiTotali, 2));
//		
//		System.out.println(Biglietto.trovaIlPiuEconomico(tuttiBiglietti).getPrezzo());
//	
//		System.out.println(mioTick.bigliettoAncoraInvenduto(tuttiBigliettiInvenduti));
		
		
		
	}

}
