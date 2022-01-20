
package AceptaElReto;

import java.util.Scanner;

public class RetoCalorias {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int quema = 1;
        int comilonas;
        
        while(quema != 0) {
            int total = 0;
            quema = leer.nextInt();
            if (quema !=0) {
                comilonas = leer.nextInt();
                int[] vcomilonas = new int[comilonas];

                for (int i = 0; i < comilonas; i++) {
                    vcomilonas[i] = leer.nextInt();
                    total += vcomilonas[i];
                }

                if (total % quema != 0)
                    System.out.println(total/quema + 1);
                else
                    System.out.println(total/quema);
            }
            
        }
    }
}
