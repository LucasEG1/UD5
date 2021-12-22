package AdventOfCode;

import java.util.Scanner;

public class TESTS {
    
    public static void main(String[] args) {
        
        int contador = 0;
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 2000; i++) {
            
           leer.nextLine();
           contador++;
            System.out.println(contador);
        }
    }
}