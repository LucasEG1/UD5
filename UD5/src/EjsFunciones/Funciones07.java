
package EjsFunciones;

import java.util.Scanner;

public class Funciones07 {

    public static double perim(double ancho, double alto) {
        double perim = 2 * ancho + 2 * alto;
        return perim;
    }
    
    public static double area(double ancho, double alto) {
        double area = ancho * alto;
        return area;
    }
            
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime el ancho de tu rectángulo");
        double x = leer.nextDouble();
        System.out.println("Dime el alto de tu rectángulo");
        double y = leer.nextDouble();
        
        System.out.println("El perímetro de tu rectángulo es: " + perim(x, y));
        System.out.println("El area de tu rectángulo es: " + area(x, y));
        
    }
}
