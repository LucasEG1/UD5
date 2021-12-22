
package AdventOfCode;

import java.util.Arrays;
import java.util.Scanner;

public class AOC03 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] cuantos1 = new int[12];
        
        for (int i = 0; i < 1000; i++) {
            
            String input = leer.nextLine();
            
            for (int j = 0; j <= 11; j++) {
                
                switch (input.charAt(j)){
                    case '1':
                        cuantos1[j] += 1;
                        break;
                }
            }
        }
        System.out.println(Arrays.toString(cuantos1));
    }
}
