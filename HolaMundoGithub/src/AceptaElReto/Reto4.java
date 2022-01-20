
package AceptaElReto;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int horas;
        int minutos;
        int hrestantes = 0;
        int mrestantes = 0;
        do {
            String hora = leer.nextLine();
            String[] t = hora.split(":");
            String h = t[0];
            String m = t[1];
            horas = Integer.parseInt(h);
            minutos = Integer.parseInt(m);
            if (horas < 24 && minutos < 60) {
                hrestantes = (23 - horas) * 60;
                mrestantes = (60 - minutos);

                if (hrestantes + mrestantes != 1440)
                System.out.println(hrestantes + mrestantes);
            }
        } while (hrestantes + mrestantes != 1440);
    }
}
