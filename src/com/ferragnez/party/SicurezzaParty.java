package com.ferragnez.party;
import java.util.Scanner;

public class SicurezzaParty {

	public static void main(String[] args) {
		
		// sviluppo l'array con i nomi degli invitati:
		String[] invitati = {"Dua Lipa" , "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		//creo l'oggetto Party con new:
		Party party = new Party(invitati);
		
		//prendo l'input dall'utente:
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il tuo nome: ");
		String utente = input.nextLine();
		
		// adesso verifico che il nome dell'utente venga venga accettato, per farlo riprendo il metodo accettaOspite che ho messo in Party:
		if(party.accettaOspite(utente)) {
			System.out.println("Benvenuto alla festa!");
		} else {
			System.out.println("Non sei tra gli invitati.");
		}
		
		input.close();

	}

}
