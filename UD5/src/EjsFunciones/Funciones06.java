
package EjsFunciones;

import java.util.Scanner;

public class Funciones06 {
    
    public static double pConIva(double x) {
        return x*1.21;
    }
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        double precio;
        
        for (int i = 0; i <= 5; i++) {
            System.out.println("Dime un precio");
            precio = leer.nextDouble();
            
            System.out.println("Tu precio con IVA es: " + pConIva(precio));
        }
    }
}
