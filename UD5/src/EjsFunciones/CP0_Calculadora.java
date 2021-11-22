
package EjsFunciones;

import java.util.Scanner;

public class CP0_Calculadora {
    
    //funcion menu
    public static int menu (int opcion) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("==CALCULADORA==");
        System.out.println("1. Suma");
        opcion = leer.nextInt();
        return opcion;
    }
    //pedir int en rango
    public static int rango(int min, int max){
        Scanner in = new Scanner(System.in);
        int n;
        
        do {
            System.out.println("Dime un número entre" + min + " y " + max);
            n = in.nextInt();

            if (n < min || n > max) {
                System.out.println("El valor introducido no es válido para esta"
                        + " operación");
            }
        } while (n < min || n > max);
        
        return n;
    }
            
    //funcion suma (void)
    //funcion resta (void)
    //funcion mult (void)
    //funcion div (void)
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
    }

}
