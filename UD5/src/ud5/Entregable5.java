
package ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Entregable5 {
    
    //Variables globales
    public static String turno = "X";
    public static String[][] tablero = new String[3][3];
    public static boolean sigueJugando = true;
    
    //Comprobar después de cada jugada si hay alguna posibilidad de victoria
    public static void ganador(){
        
        String linea[] = new String[8];
        linea[0] = (tablero[0][0] + tablero[0][1] + tablero[0][2]);
        linea[1] = (tablero[1][0] + tablero[1][1] + tablero[1][2]);
        linea[2] = (tablero[2][0] + tablero[2][1] + tablero[2][2]);
        linea[3] = (tablero[0][0] + tablero[1][0] + tablero[2][0]);
        linea[4] = (tablero[0][1] + tablero[1][1] + tablero[2][1]);
        linea[5] = (tablero[0][2] + tablero[1][2] + tablero[2][2]);
        linea[6] = (tablero[0][0] + tablero[1][1] + tablero[2][2]);
        linea[7] = (tablero[0][2] + tablero[1][1] + tablero[2][0]);
        
        for (int i = 0; i < linea.length; i++) {
            String aux = linea[i];
            
            switch (aux) {
                case "XXX":
                    System.out.println("¡X es el ganador!");
                    sigueJugando = false;
                    break;
                case "OOO":
                    System.out.println("¡O es el ganador!");
                    sigueJugando = false;
                    break;
                default:
                    sigueJugando = true;
                    break;
            }
        }
    }
    
    //Para determinar a quién le toca poner ficha después de cada jugada
    public static void cambioTurno () {
        if ("X".equals(turno)) {
            turno = "O";
        } else if ("O".equals(turno))
            turno = "X";
        
    }
    
    //Únicamente utilizado para el principio del juego, muestra el tablero vacío
    public static void generarTabInicial(){
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "-";
            }
        }
    }
    
    //Enseña el tablero después de poner la ficha
    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("[" + tablero[i][j] + "] ");
            }
            System.out.println("\n");
        }
    }
    
    //Pedir en un rango (usado para que la persona ponga una ficha dentro del tablero
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
    
    //Comprobar si el lugar elegido ya tiene una ficha puesta o no.
    public static void comprobarLugar (int posi, int posj){
        
        while (!"-".equals(tablero[posi][posj])) {
                System.out.println("Esta posición ya está ocupada por otro jugador");
                System.out.println("En qué fila quieres poner " + turno + "?");
                posi = (rango(1,3) - 1);
                System.out.println("En qué columna quieres poner " + turno + "?");
                posj = (rango(1,3) - 1);
            }
            
            tablero[posi][posj] = turno;
    }
    
    
    
    public static void main(String[] args) {
        
        int contX = 0;
        int contO = 0;
        
        //JUGADOR CONTRA JUGADOR
        //JUGADOR CONTRA JUGADOR
        //JUGADOR CONTRA JUGADOR
        //JUGADOR CONTRA JUGADOR
        //JUGADOR CONTRA JUGADOR
        
        Scanner leer = new Scanner(System.in);
        
        generarTabInicial();
            
        while (sigueJugando == true) {
            
            mostrarTablero();
            
            System.out.println("TURNO DE " + turno + "\n");
            System.out.println("En qué fila quieres poner " + turno + "?");
            int posi = (rango(1,3) - 1);
            System.out.println("En qué columna quieres poner " + turno + "?");
            int posj = (rango(1,3) - 1);

            comprobarLugar(posi, posj);
            
            if ("X".equals(turno) && contX < 3)
                System.out.println(contX);
                contX++;
            if ("O".equals(turno) && contO < 3)
                System.out.println(contO);
                contO++;
            
            
            cambioTurno();
            
            ganador();
        }
    }
}