
package AdventOfCode;

import java.util.Scanner;

public class AOC01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int[] nums = new int[2001];
        for (int i = 1; i < 2000; i++) {   
            nums[i] = leer.nextInt();
            if (nums[i] > nums[i-1])
                cont++;
        }
        System.out.println(cont);
    }
}
