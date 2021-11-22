

package EjsFunciones;

import java.util.Scanner;

public class Funciones03 {
    
    public static int minimo(int a, int b){
        if (a < b)
            return a;
        else
            return b;
    }
            
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("dime un numero a");
        int a = leer.nextInt();
        System.out.println("dime un numero b");
        int b = leer.nextInt();
        
        System.out.println("El mínimo entre a o b es " + minimo(a, b));
    }
}
