
package ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Entregable5 {
    
    public static String turno = "X";
    public static String[][] tablero = new String[3][3];
    public static boolean sigueJugando = true;
    
    public static void ganador(){
        
        String linea[] = new String[8];
        linea[0] = (Arrays.toString(tablero[0]) + Arrays.toString(tablero[1]) + Arrays.toString(tablero[2]));
        linea[1] = (Arrays.toString(tablero[3]) + Arrays.toString(tablero[4]) + Arrays.toString(tablero[5]));
        linea[2] = (Arrays.toString(tablero[6]) + Arrays.toString(tablero[7]) + Arrays.toString(tablero[8]));
        linea[3] = (Arrays.toString(tablero[0]) + Arrays.toString(tablero[3]) + Arrays.toString(tablero[6]));
        linea[4] = (Arrays.toString(tablero[1]) + Arrays.toString(tablero[4]) + Arrays.toString(tablero[7]));
        linea[5] = (Arrays.toString(tablero[8]) + Arrays.toString(tablero[5]) + Arrays.toString(tablero[2]));
        linea[6] = (Arrays.toString(tablero[0]) + Arrays.toString(tablero[4]) + Arrays.toString(tablero[8]));
        linea[7] = (Arrays.toString(tablero[6]) + Arrays.toString(tablero[4]) + Arrays.toString(tablero[2]));
        
        /*for (int i = 0; i < linea.length; i++) {
            String aux = linea[i];
            
            if (aux.equals("XXX")) {
                System.out.println("¡X es el ganador!");
                sigueJugando = false;
            }
            else 
                if (aux.equals("OOO")) {
                System.out.println("¡O es el ganador!");
                sigueJugando = false;
            } else
                    break;
        }*/
    }
    
    public static void cambioTurno () {
        if ("X".equals(turno)) {
            turno = "O";
        } else if ("O".equals(turno))
            turno = "X";
        
    }
    
    public static void generarTabInicial(){
        //String[][] tablero = new String[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "-";
            }
        }
    }
    
    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("[" + tablero[i][j] + "] ");
            }
            System.out.println("\n");
        }
    }
    
    public static int rango(int min, int max){
        Scanner in = new Scanner(System.in);
        int n;
        
        do {
            System.out.println("Dime un número entre " + min + " y " + max);
            n = in.nextInt();

            if (n < min || n > max) {
                System.out.println("El valor introducido no es válido para esta"
                        + " operación.");
            }
        } while (n < min || n > max);
        
        return n;
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        generarTabInicial();
            
        while (sigueJugando) {
            
            mostrarTablero();
            
            System.out.println("TURNO DE " + turno + "\n");
            System.out.println("En qué fila quieres poner " + turno + "?");
            int posi = (rango(1,3) - 1);
            System.out.println("En qué columna quieres poner " + turno + "?");
            int posj = (rango(1,3) - 1);

            /// COMPROBAR OCUPACION
            tablero[posi][posj] = turno;
            
            
            cambioTurno();
            //ganador();
        }
        /*// Rellenamos la matriz con los números del 1 al 25
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = '-';
            }
        }

        // Mostramos la matriz
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }*/
    }
}