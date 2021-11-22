package EjsFunciones;

import java.util.Scanner;

public class Funciones01 {
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime un número a");
        double a = leer.nextDouble();
        System.out.println("Dime un número b");
        double b = leer.nextDouble();
        
        System.out.println("a por b es: " + multiplicar(a, b));
    }
}