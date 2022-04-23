
package uspg.edu.gt.cadenapalindromo;

import java.util.Scanner;

/**
 *
 * @author Andrea Erazo
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la palbra que quieres saber si políndroma");
        
        String palabra = sc.next();
        
        System.out.println("¿La palabra" + palabra+"es palíndromo?" +  esPalindromo(palabra));
    }
    
    public static boolean esPalindromo(String palabra){
        
        palabra = palabra.toLowerCase();
        
        
        for (int i = 0, j= palabra.length()-1; i <= j; i++, j--) {   
            if (palabra.charAt(i) !=palabra.charAt(j)){
                return false;
            }
        }
       
        
        return true;
    }
    
}
