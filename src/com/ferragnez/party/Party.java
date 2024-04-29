package com.ferragnez.party;

public class Party {
	public String []invitati;
	public boolean isLuisAntipatico;
	
	// costruttore:
	public Party(String[] invitati) {
		this.invitati = invitati;
		this.isLuisAntipatico = true;
	}
	
	// fornire un metodo accettaOspite che prenda come parametro un nome e verifichi se è all'interno dell'array di invitati:
	
	public boolean accettaOspite(String utente) {
		if(isLuisAntipatico && utente.equals("Luis")) {
			return false;
		}
		// applico ciclo foreach:
		for (String invitato : invitati) {
			
			if (invitato.equals(utente)) {
				return true;
			} 
		}
		return false;
	}
	
	//creo la funzione per permettere a Fedez di escludere Luis dagli invitati:
	public void setIsLuisAntipatico(boolean isLuisAntipatico) {
		this.isLuisAntipatico = isLuisAntipatico;
	}
	

}
