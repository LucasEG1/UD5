
package AceptaElReto;

import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int x = 1;
        int y = 1;
        while (x >= 0 && y >= 0) {
            x = leer.nextInt();
            y = leer.nextInt();
            if (x >= 0 && y >= 0) {
            System.out.println((2*x)+(2*y));
            }
        }
    }
}