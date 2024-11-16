/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241116_wang_stringhe;

import java.util.Scanner;

public class scan {
    
    private String Utente;
        //Inizio : Creazione di un metodo per l'input dell'utente.
        public void scan(){
            Scanner myScan = new Scanner(System.in);
            System.out.print("inserisci la parola : ");
            Utente = myScan.next();
        }
        //Fine : Creazione di un metodo per l'input dell'utente.
        
        // Inizio : Creazione di un metodo per la stampa dell'input inserito dall'utente.
        public void stampaInput(){
             System.out.print("\nl'input dell'utente");
        }
        // Fine : Creazione di un metodo per la stampa dell'input inserito dall'utente.
        
        // Inizio : Creazione del metodo get.
        public String getStringa(){
            return Utente;
        }
        // Fine : Creazione del metodo get.
}

