
package EjsFunciones;

import java.util.Scanner;

public class CP0_Calculadora {
    
    //Función menú.
    public static int menu (String welcome) {
         
        System.out.println("==CALCULADORA==");
        System.out.println("1. Suma (a+b)\n2. Resta(a-b)\n3. Multiplicación (a*b)"
                + "\n4. División (a/b)\n5. Área de un rectángulo (base*altura)\n"
                + "6. Área de un triángulo ((base*altura)/2)\n7. Área de un círculo (pi * radio²)"
                + "\n8. Seno, Coseno, Tangente de X\n9. Salir.");
        int opcion = rango(1, 9);
        return opcion;
    }
    
    //pedir int en rango.
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
            
    //Función suma (double).
    public static double suma (double a, double b) {
        double total = a+b;
        return total;
    }
    
    //Función resta (double).
    public static double resta (double a, double b) {
        double total = a-b;
        return total;
    }
    

    //Función multiplicación (double).
    public static double multip (double a, double b) {
        double total = a*b;
        return total;
    }
    
    //Función void división (error si b == 0).
    public static void div (double a, double b) {
        
        double total;
        if (b == 0) {
            System.out.println("ERROR: No se puede dividir por 0.");
        } else {
            total = (a / b);
            System.out.println("El resultado es: " + total);
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean acabar = false;
        
        System.out.println("¡Bienvenido a la calculadora! Pulsa 'Intro' para continuar :) ");
        String welcome = leer.nextLine();
        
        while (!acabar) {    
            
            int opcion = menu(welcome);
            
            //Pide a y b. Luego, muestra el resultado de la operación.
            if (opcion == 1) {
                
                System.out.println("==SUMA==");
                System.out.print("Dime un valor para 'a': ");
                double a = leer.nextDouble();
                System.out.print("Dime un valor para 'b': ");
                double b = leer.nextDouble();

                System.out.println("El resultado es: " + suma(a, b));
                System.out.println("");
            }

            ////Pide a y b. Luego, muestra el resultado de la operación.
            if (opcion == 2) {
                
                System.out.println("==RESTA==");
                System.out.print("Dime un valor para 'a': ");
                double a = leer.nextDouble();
                System.out.print("Dime un valor para 'b': ");
                double b = leer.nextDouble();

                System.out.println("El resultado es: " + resta(a, b));
                System.out.println("");
            }

            //Pide a y b. Luego, muestra el resultado de la operación.
            if (opcion == 3) {
                
                System.out.println("==MULTIPLICACIÓN==");
                System.out.print("Dime un valor para 'a': ");
                double a = leer.nextDouble();
                System.out.print("Dime un valor para 'b': ");
                double b = leer.nextDouble();

                System.out.println("El resultado es: " + multip(a, b));
                System.out.println("");
            }

            //Pide a y b. Luego, devuelve el resultado si b NO es cero.
            if (opcion == 4) {
                
                System.out.println("==DIVISIÓN==");
                System.out.print("Dime un valor para 'a': ");
                double a = leer.nextDouble();
                System.out.print("Dime un valor para 'b': ");
                double b = leer.nextDouble();

                div(a, b);
                System.out.println("");
            }

            //Pide base, altura y muestra el área después de usar la función
            //de multiplicar.
            if (opcion == 5) {
                
                System.out.println("==ÁREA DE UN RECTÁNGULO==");
                System.out.print("Dime la longitud de la base (en cm): ");
                double a = rango(0, 1000000);
                System.out.print("Dime la altura del rectángulo (en cm): ");
                double b = rango(0, 1000000);

                System.out.println("El área total del rectángulo (en cm²)"
                        + " es: " + multip(a, b));
                System.out.println("");
            }

            //Pide base, altura, y luego hace la misma operación que el
            //rectángulo pero divide entre 2 antes de mostrar resultado.
            if (opcion == 6) {
                
                System.out.println("==ÁREA DE UN TRIÁNGULO EQUILÁTERO==");
                System.out.print("Dime la longitud de la base (en cm): ");
                double a = rango(0, 1000000);
                System.out.print("Dime la altura (en cm): ");
                double b = rango(0, 1000000);

                System.out.println("El área total del triángulo (en cm²)"
                        + " es: " + (multip(a, b)/2));
                System.out.println("");
            }
            
            //Pide radio, luego calcula radio² antes de multiplicar por pi.
            if (opcion == 7) { 
                
                System.out.println("==ÁREA DE UN CÍRCULO==");
                System.out.print("Dime la longitud del radio (en cm): ");
                double a = rango(0, 1000000);

                System.out.println("El área total del círculo (en cm²)"
                        + " es: " + multip(  multip(a, a)  ,  Math.PI  ));
                System.out.println("");
            }
            
            if (opcion == 8) {
                
                System.out.println("==SENO, COSENO Y TANGENTE DE X");
                System.out.println("Dime X");
                double x = rango(-360, 360);
                
                System.out.println("El seno de X es: " + Math.sin(x) );
                System.out.println("El coseno de X es: " + Math.cos(x) );
                System.out.println("La tangente de X es: " + (Math.sin(x)/Math.cos(x)));
                System.out.println("");
            }
            
            if (opcion == 9) {
                
                System.out.println("==SALIR==");
                System.out.println();
                System.out.println("¡Hasta la próxima!");
                acabar = true;
            }
        }
    }
}