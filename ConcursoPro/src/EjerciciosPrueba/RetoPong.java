package EjerciciosPrueba;

import java.util.Scanner;

public class RetoPong {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int sonidos = 1;
        String jugada;

        while (sonidos != 0) {
            int contadorPIC = 0;
            int puntosI = 0;
            int puntosD = 0;
            sonidos = leer.nextInt();

            if (sonidos != 0) {
                for (int i = 0; i < sonidos; i++) {
                    jugada = leer.next();

                    switch (jugada) {

                        case "PIC":
                            contadorPIC++;
                            break;

                        case "PONG!":
                            if (contadorPIC % 2 == 0) {
                                puntosI++;
                            } else {
                                puntosD++;
                            }
                            break;
                    }
                }
                System.out.println(puntosI + " " + puntosD);
            }
        }
    }
}
