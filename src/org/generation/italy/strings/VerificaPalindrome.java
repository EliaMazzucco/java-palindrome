package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {

		//chiedere all�utente di inserire una parola
		//verificare se � palindroma
		//stampare in console la lunghezza della parola e se � palindroma oppure no

		String parola, parolaPalindroma = "";		
		System.out.print("Inserisci la parola: ");
		Scanner scan = new Scanner(System.in);
		parola = scan.nextLine();
		
		int length = parola.length();				
		
		
		for(int i = length -1; i >= 0 ; i--) {
			 parolaPalindroma = parolaPalindroma + parola.charAt(i);
			 
		}
			 if(parola.equals(parolaPalindroma)) {
				 System.out.println("La parola " + parola + " � una parola palindroma " + "ed � lunga: " + length);
				 
				 
			 }else {
				 System.out.println("Non � un parola palindroma " + "ed � lunga: " + length);
			
			 
		}
		scan.close();
	}

}
