package com.ferragnez.party;

public class Party {
	public String []invitati;
	
	// costruttore:
	public Party(String[] invitati) {
		this.invitati = invitati;
	}
	
	// fornire un metodo accettaOspite che prenda come parametro un nome e verifichi se è all'interno dell'array di invitati:
	
	public boolean accettaOspite(String utente) {
		// applico ciclo foreach:
		for (String invitato : invitati) {
			
			if (invitato.equals(utente)) {
				return true;
			} 
		}
		return false;
	}
	

}
