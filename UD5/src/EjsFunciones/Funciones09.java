

package EjsFunciones;

import java.util.Scanner;

public class Funciones09 {
    
    public static int maximo(int a, int b) {
        
        if (a > b)
            return a;
        else 
            return b;
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.println("Dime un número");
        n1 = leer.nextInt();
        System.out.println("Dime otro número");
        n2 = leer.nextInt();
        System.out.println("Dime otro número");
        n3 = leer.nextInt();
        
        int max = maximo(n1, n2);
        System.out.println(maximo( max , n3));
        
        System.out.println(maximo( maximo(n1, n2) , n3));
    }
}