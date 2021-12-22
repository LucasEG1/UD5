
package AdventOfCode;

import java.util.Scanner;

public class AOC02_2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int depth = 0;
        int horiz = 0;
        int aim = 0;
        
        for (int i = 0; i < 1000; i++) {
            
            String actualDirection = leer.next();
            
            int cantidad = leer.nextInt();
            
            switch (actualDirection) {
            
                case "forward":
                    horiz += cantidad;
                    depth += cantidad*aim;
                    break;
                
                case "up":
                    aim -= cantidad;
                    break;
                case "down":
                    aim += cantidad;
                    break;
            }
        }
        
        int total = horiz*depth;
        System.out.println(total);
    }
}
