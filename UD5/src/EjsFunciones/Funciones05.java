

package EjsFunciones;

import java.util.Scanner;

public class Funciones05 {
    
    public static double kmetros(int x) {
        return x * 1.60934;
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime un valor entero en millas");
        
        int millas = leer.nextInt();
        
        System.out.println(millas + " millas equivale(n) a " + kmetros(millas)
        + " kilómetros.");
        
    }
}   