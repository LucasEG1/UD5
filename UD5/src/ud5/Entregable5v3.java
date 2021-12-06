
package ud5;

import java.util.Scanner;

public class Entregable5v3 {
    
    //VARIABLES GLOBALES VARIABLES GLOBALES
    public static String turno = "X";
    public static String[][] tablero = new String[3][3];
    public static boolean sigueJugando = true;
    public static int turnosTotales = 0;
    
    
    //Funciones (ordenadas según se usan antes o después en el programa
    
    //Código que se ejecuta si se elige Jugador contra Jugador.
    public static void jugadorContraJugador() {
    
    generarTabInicial();
            
    while (sigueJugando) {

        mostrarTablero();

        if (turnosTotales <= 5) {
            ponerFicha(); 
            turnosTotales++;
        }

        if (turnosTotales == 6) {
            System.out.println("*********************************************************");
            System.out.println("SE HAN ALCANZADO EL MÁXIMO DE FICHAS PARA AMBOS JUGADORES");
            System.out.println("AHORA, CADA JUGADOR DEBERÁ MOVER UNA FICHA EN SU TURNO");
            System.out.println("*********************************************************");
            mostrarTablero();
            turnosTotales++;
        }

        if (turnosTotales > 6 && turnosTotales < 25) {
            System.out.println("TURNO DE " + turno + "\n");
            cambiarFicha();
            turnosTotales++;
        }
        
        if (turnosTotales == 25) {
            System.out.println("\n\nSe han alcanzado el número máximo de turnos\n"
                    + "y no ha ganado nadie, por lo que los jugadores están\n"
                    + "EMPATADOS, Bravo.");
            sigueJugando = false;
        }
        muestraCuantosTurnos();

        cambioTurno();

        ganador();
    }
}
    
    //Reemplaza los movimientos del jugador "O" por randoms válidos.
    public static void jugadorContraMaquina() {
    generarTabInicial();
            
        while (sigueJugando) {
            
            mostrarTablero();
            
            if (turnosTotales <= 5) {
                if ("X".equals(turno))
                    ponerFicha();
                if ("O".equals(turno)){
                    ponerFichaMaq();
                } 
                turnosTotales++;
            }

            if (turnosTotales == 6) {
                System.out.println("*********************************************************");
                System.out.println("SE HAN ALCANZADO EL MÁXIMO DE FICHAS PARA AMBOS JUGADORES");
                System.out.println("AHORA, CADA JUGADOR DEBERÁ MOVER UNA FICHA EN SU TURNO");
                System.out.println("*********************************************************");
                mostrarTablero();
                turnosTotales++;
            }
            
            if (turnosTotales > 6 && turnosTotales < 25) {
                System.out.println("TURNO DE " + turno);
                if ("X".equals(turno))
                    cambiarFicha();
                if ("O".equals(turno)){
                    cambiarFichaMaq();
                } 
                turnosTotales++;
            }
            
            if (turnosTotales == 25) {
                System.out.println("\n\nSe han alcanzado el número máximo de turnos\n"
                        + "y no ha ganado nadie, por lo que los jugadores están\n"
                        + "EMPATADOS, Bravo.");
                sigueJugando = false;
            }
            muestraCuantosTurnos();

            cambioTurno();
            mostrarTablero();
            ganador();
        }
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
    
    //Pide Fila y columna para poner ficha de UN jugador
    public static void ponerFicha() {
        System.out.println("En qué fila quieres poner " + turno + "?");
        int poneri = (rango(1, 3) - 1);
        System.out.println("En qué columna quieres poner " + turno + "?");
        int ponerj = (rango(1, 3) - 1);

        comprobarLugar(poneri, ponerj);
    }
    
    //Poner ficha pero para la máquina
    public static void ponerFichaMaq() {
        
        int poneri = (int) (Math.random() * 3);
        int ponerj = (int) (Math.random() * 3);
        
        comprobarLugarMaq(poneri, ponerj);
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
    public static void comprobarLugar (int posi, int posj) {
        
        while (!"-".equals(tablero[posi][posj])) {
            System.out.println("Esta posición ya está ocupada por otro jugador");
            System.out.println("En qué fila quieres poner " + turno + "?");
            posi = (rango(1,3) - 1);
            System.out.println("En qué columna quieres poner " + turno + "?");
            posj = (rango(1,3) - 1);
        }
        tablero[posi][posj] = turno;
    }
    
    //ComprobarLugar pero para Jugador contra máquina
    public static void comprobarLugarMaq (int posi, int posj) {
        
        while (!"-".equals(tablero[posi][posj])) {
            posi = (int) (Math.random() * 3);
            posj = (int) (Math.random() * 3);
        }
        tablero[posi][posj] = turno;
    }
    
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
                    System.out.println("");;
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
    
    //Muestra cuántos turnos han pasado.
    public static void muestraCuantosTurnos(){
        System.out.println("Se han jugado " + turnosTotales + " turnos.");
    }
    
    //Pide posición de ficha a quitar y posición de destino de la ficha
    public static void cambiarFicha() {
        
        int quitarFila;
        int quitarColumna;
        
        System.out.println(turno + " QUE QUIERAS QUITAR: Fila");
        quitarFila = (rango(1,3) -1);
        System.out.println(turno + " QUE QUIERAS QUITAR: Columna");
        quitarColumna = (rango(1,3) -1);
        
        while (!tablero[quitarFila][quitarColumna].equals(turno)) {

            System.out.println("********************");
            System.out.println("¡Esa no es tu ficha!");
            System.out.println("********************");

            System.out.println(turno + " QUE QUIERAS QUITAR: Fila");
             quitarFila = (rango(1,3) -1);
            System.out.println(turno + " QUE QUIERAS QUITAR: Columna");
            quitarColumna = (rango(1,3) -1);
        }
        if (tablero[quitarFila][quitarColumna].equals(turno)){
            ponerFicha();
            tablero[quitarFila][quitarColumna] = "-";
        }
    }
    
    //Cambia la posición de la ficha en el turno de la máquina.
    public static void cambiarFichaMaq() {
        
        int quitarFila;
        int quitarColumna;
        
        quitarFila = (int) (Math.random() * 3);
        quitarColumna = (int) (Math.random() * 3);
        
        while (!tablero[quitarFila][quitarColumna].equals(turno)) {

            quitarFila = (int) (Math.random() * 3);
            quitarColumna = (int) (Math.random() * 3);
        }
        if (tablero[quitarFila][quitarColumna].equals(turno)){
            ponerFichaMaq();
            tablero[quitarFila][quitarColumna] = "-";
        }
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("||============||");
        System.out.println("||TRES EN RAYA||");
        System.out.println("||============||");
        System.out.println("\n");
        System.out.println("¿Qué quieres hacer?");
        System.out.println("******************");
        System.out.println("1. Jugador contra jugador \n"
                         + "2. Jugador vs Máquina \n"
                         + "3. Salir del juego");
        
        int opcion = rango(1,3);
        
        switch(opcion) {
            case 1:
                System.out.println("==JUGADOR CONTRA JUGADOR==");
                jugadorContraJugador();
            break;
            
            case 2: 
                System.out.println("==JUGADOR CONTRA MÁQUINA==");
                jugadorContraMaquina();
            break;
            
            case 3:
                System.out.println("¡Hasta la próxima!");
            break;
        }
    }
}