/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241116_wang_stringhe;

// Wang Jimmy 4infD.

/*
Scrivi un programma in Java che permetta all'utente di inserire una stringa. Il programma deve contare quante volte la lettera "a" appare nella stringa e poi stampare la lettera "A" in maiuscolo tante volte quante sono le occorrenze.
*/
public class Main {

    public static void main(String[] args) {
        // Inizio : Instazazione di un oggetto per il richiamo delle funzioni appartenenti della classe scan.
        scan Input = new scan();
        
        Input.scan();
        // Fine : Instazazione di un oggetto per il richiamo delle funzioni appartenenti della classe scan.
        
        // Inizio : Instazazione di un oggetto per il richiamo delle funzioni appartenenti della classe CercaA.
        CercaA FindA = new CercaA(Input);
        
        FindA.aFinder(Input);
        
        FindA.stampa();
        // Fine : Instazazione di un oggetto per il richiamo delle funzioni appartenenti della classe CercaA.
    }
    
}
