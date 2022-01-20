
package AceptaElReto;

import java.util.Scanner;

public class RetoNavidad {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia;
        int mes;
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            dia = leer.nextInt();
            mes = leer.nextInt();
            if (dia == 25 && mes == 12) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
