/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241116_wang_stringhe;

public class CercaA {
    
    //Inizio : Dichiarazioni dei attributi per la classe che vengono utilizzati dopo nei metodi.
    private char LetteraA = 'a';
    private int occorrenze = 0;
    private String CercaA;
    //Fine : Dichiarazioni dei attributi per la classe che vengono utilizzati dopo nei metodi.
    
    // Inizio : Costruttore all'interno dei parametri di tipo scan.
    public CercaA(scan Input) {

    }
    // Fine : Costruttore all'interno dei parametri di tipo scan.
    
    // Inizio : Creazione di un metodo per trasformazione di una stringa inserita dall'utente in una array di carratteri e la ripetizione di a nella stringa inserita dall'utente.
    public void aFinder(scan Input){

        for(int i = 0; i < Input.getStringa().length(); i++){
            if (Input.getStringa().charAt(i) == LetteraA){
                occorrenze = occorrenze + 1;
            }
        }
        
    }
    // Inizio : Creazione di un metodo per trasformazione di una stringa inserita dall'utente in una array di carratteri e la ripetizione di a nella stringa inserita dall'utente.
    
    // Inizio : Creazione di un metodo per la stampa delle occorrenze e la lettera A occorrenze volte.
    public void stampa(){
        System.out.print("\nLa parola dell'utente contiene :" + occorrenze + " La lettera a");
        System.out.print("\n");
        for(int i = 0; i < occorrenze; i++){
            System.out.print("A");
        }
        System.out.print("\n");
    }
    // Fine : Creazione di un metodo per la stampa delle occorrenze e la lettera A occorrenze volte.
}
