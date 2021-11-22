
package EjsFunciones;

import java.util.Scanner;

public class Funciones04 {
    
    public static int signo(int a) {
        if (a > 0)
            return 1;
        else if (a == 0)
            return 0;
        else
            return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("dime un numero");
        int n = leer.nextInt();
        
        System.out.println("El signo de tu numero es: " + signo(n));
    }
}
