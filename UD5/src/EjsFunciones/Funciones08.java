
package EjsFunciones;

import java.util.Scanner;

public class Funciones08 {

    public static int suma(int n) {
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    
    public static int mul(int n) {
        
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime un número N");
        int n = leer.nextInt();
        
        System.out.println("La suma desde 1 a N es: " + suma(n));
        System.out.println("El producto desde 1 a N es: " + mul(n));
    }
    
}
