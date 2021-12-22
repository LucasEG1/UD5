
package AdventOfCode;

import java.util.Scanner;

public class AOC01_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int total = 0;
        int[] nums = new int[2000];
        
        for (int i = 0; i < nums.length; i++) {   
            nums[i] = leer.nextInt();
        }
        
        for (int i = 0; i < 1997; i++) {
            
            int A = nums[i] + nums[i+1] + nums[i+2];
            int B = nums[i+1] + nums[i+2] + nums[i+3];
            if (B > A)
                total++;
        }
        System.out.println(total);
    }
}
