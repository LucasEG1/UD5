
package AdventOfCode;

import java.util.Scanner;

public class AOC02 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int depth = 0;
        int horiz = 0;
        
        for (int i = 0; i < 1000; i++) {
            
            String direccion = leer.next();
            
            int cantidad = leer.nextInt();
            
            switch (direccion) {
            
                case "forward":
                    horiz+= cantidad;
                    break;
                
                case "up":
                    depth -= cantidad;
                    break;
                case "down":
                    depth += cantidad;
                    break;
            }
        }
        
        int total = horiz*depth;
        System.out.println(horiz);
        System.out.println(depth);
        System.out.println(total);
    }
}
