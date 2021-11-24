
package EjsFunciones;

import java.util.Scanner;

public class CP0_Calculadora {
    
    //Función menú
    public static int menu (String welcome) {
         
        System.out.println("==CALCULADORA==");
        System.out.println("1. Suma (a+b)\n2. Resta(a-b)\n3. Multiplicación (a*b)"
                + "\n4. División (a/b)\n5. Área de un rectángulo (base*altura)\n"
                + "6. Área de un triángulo ((base*altura)/2)\n7. Área de un círculo (pi * radio²)"
                + "\n8. Seno, Coseno, Tangente de X\n9. Salir.");
        int opcion = rango(1, 9);
        return opcion;
    }
    
    //pedir int en rango
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
            
    //Función suma (double)
    public static double suma (double a, double b) {
        double total = a+b;
        return total;
    }
    
    //Función resta (double)
    public static double resta (double a, double b) {
        double total = a-b;
        return total;
    }
    

    //Función multiplicación (double)
    public static double multip (double a, double b) {
        double total = a*b;
        return total;
    }
    
    //Función void división (error si b == 0)
    public static void div (double a, double b) {
        
        double total;
        if (b == 0) {
            System.out.println("ERROR: No se puede dividir por 0.");
        } else {
            total = (a / b);
            System.out.println(total);
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¡Bienvenido a la calculadora! Pulsa 'Intro' para continuar :) ");
        String welcome = leer.nextLine();
        int opcion = menu(welcome);
        
        if (opcion == 1) {
            System.out.println("==SUMA==");
            System.out.print("Dime un valor para 'a': ");
            int a = leer.nextInt();
            System.out.print("Dime un valor para 'b': ");
            int b = leer.nextInt();
            
            System.out.println("El resultado es: " + suma(a, b));
        }
        
        if (opcion == 2) {
            System.out.println("==RESTA==");
            System.out.print("Dime un valor para 'a': ");
            int a = leer.nextInt();
            System.out.print("Dime un valor para 'b': ");
            int b = leer.nextInt();
            
            System.out.println("El resultado es: " + resta(a, b));
        }
        
        if (opcion == 3) {
            System.out.println("==MULTIPLICACIÓN==");
            System.out.print("Dime un valor para 'a': ");
            int a = leer.nextInt();
            System.out.print("Dime un valor para 'b': ");
            int b = leer.nextInt();
            
            System.out.println("El resultado es: " + multip(a, b));
        }
        
        if (opcion == 4) {
            System.out.println("==DIVISIÓN==");
            System.out.print("Dime un valor para 'a': ");
            int a = leer.nextInt();
            System.out.print("Dime un valor para 'b': ");
            int b = leer.nextInt();
            
            div(a, b);
        }
    }

}