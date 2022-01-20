
package AceptaElReto;

import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        
        do{
            n = leer.nextInt();
            if (n != 0 ) {
                if (n % 2 == 0)
                    System.out.println("DERECHA");
                else
                    System.out.println("IZQUIERDA");
            }
        }while (n!=0);
    }
}
