
package EjsFunciones;

import java.util.Scanner;


public class Funciones02 {
    
    public static boolean mayorEdad( int edad) {
        
        return (edad >= 18);
    }
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime tu edad:");
        int edad = leer.nextInt();
        
        System.out.println("La persona con " + edad + " años es mayor "
                + "de edad? ==>" + mayorEdad(edad));
    }
}