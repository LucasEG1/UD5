
package EjsFunciones;

import java.util.Scanner;

public class CalculadoraPractica {
    
    
    /**VARIABLES GLOBALES*/
    public static int contador = 0;
    public static int maxCuentas = 100;
    public static String[] vNombre = new String[maxCuentas];
    public static double[] vDinero = new double[maxCuentas];
    
    
    /**FUNCIONES*/
    
    public static int rango (int min, int max) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un  número entre " + min + " y " + max);
        int n = leer.nextInt();
        
        while (n<min || n > max) {
            if (n<min || n > max) {
                System.out.println("El número introducido no es válido para esta operación");
                System.out.print("Introduzca un valor:");
                n = leer.nextInt();
            }
        }   
        return n;
    }
    
    //Muestra el menú y devuelve la opción elegida
    public static int menu() {
        System.out.println("");
        System.out.println("---¿Qué desea hacer?---");
        System.out.println("1. Ver cuentas");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Agregar cuenta");
        System.out.println("5. Eliminar cuenta");
        System.out.println("6. Buscar cuenta");
        System.out.println("7. Mostrar morosos");
        System.out.println("8. Salir");
        
        int respuesta = rango(1,8);
        return respuesta;
    }
    
    public static void verCuentas() {
        
        if (contador == 0)
            System.out.println("**No hay cuentas registradas**");
        else {
            for (int i = 0; i < contador; i++) {
                System.out.println(i + ". " + vNombre[i] + " = " + vDinero[i]);
            }
        }
    }
    
    public static void ingresarDinero() {
        System.out.println("===INGRESAR DINERO===");
        Scanner leer = new Scanner(System.in);
        
        if (contador == 0)
            System.out.println("**No hay cuentas registradas**");
        else {
            
            System.out.println("¿A qué cuenta desea ingresar dinero?");
            int pos = rango(0, contador-1);

            System.out.println("¿Cuánto dinero desea ingresar?");
            double cantidad = leer.nextDouble();
            
            while (cantidad < 0) {
                System.out.println("No se aceptan valores negativos");
                System.out.print("¿Cuánto dinero desea ingresar?");
                cantidad = leer.nextDouble();
            }
            vDinero[pos] += cantidad;
            
            System.out.println("Se han añadido " + cantidad + "€ a la cuenta número " + pos);
        }
    }
    
    public static void retirarDinero() {
        System.out.println("===RETIRAR DINERO===");
        Scanner leer = new Scanner(System.in);
        
        if (contador == 0)
            System.out.println("**No hay cuentas registradas**");
        else {
            System.out.println("¿A qué cuenta desea retirar dinero?");
            int pos = rango(0, contador-1);

            System.out.println("¿Cuánto dinero desea retirar?");
            double cantidad = leer.nextDouble();
            
            while (cantidad < 0) {
                System.out.println("No se aceptan valores negativos");
                System.out.print("¿Cuánto dinero desea retirar?");
                cantidad = leer.nextDouble();
            }
            vDinero[pos] -= cantidad;

            System.out.println("Se han retirado " + cantidad + "€ a la cuenta número " + pos);
        }
    }
    
    public static void agregarCuenta() {
        System.out.println("===AGREGAR CUENTA===");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Nombre del titular?");
        String nombreCliente = leer.nextLine();
        vNombre[contador] = nombreCliente;
        
        System.out.println("¿Dinero a ingresar?");
        double  dineroCliente = leer.nextDouble();
        vDinero[contador] = dineroCliente;
        
        contador++;
    }
    
    public static void eliminarCuenta() {
        
        System.out.println("===ELIMINAR CUENTA===");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Qué NÚMERO DE CUENTA desea eliminar? También se"
                + " borrará la información asociada");
        
        int pos = leer.nextInt();
        
        for (int i = pos; i < (contador-1); i++) {
            vNombre[i] = vNombre[i+1];
            vDinero[i] =  vDinero[i+1];
        }
        contador--;
    }
    
    public static void buscarCuenta() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Qué quieres buscar?");
        String buscar = leer.nextLine();
        
        for (int i = 0; i <= contador; i++) {
            
            //if(vNombre[i].toUpperCase(); 
            
        }
    }
    
    public static void mostrarMorosos() {
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < contador; i++) {
            if (vDinero[i] < 0) {
                System.out.println(i + ": " + vNombre[i] + " tiene €" + vDinero[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("==APP DE CUENTAS BANCARIAS==");
        int resp;
        do {
            resp = menu();
            
            switch (resp) {
                case 1:
                    verCuentas();
                break;

                case 2:
                    ingresarDinero();
                break;

                case 3: 
                    retirarDinero();
                break;

                case 4:
                    agregarCuenta();
                break;
                
                case 5: 
                    eliminarCuenta();
                break;
                
                case 6: 
                    //buscar cuenta
                break;
                
                case 7: 
                    mostrarMorosos();
                break;
                
                case 8:
                    System.out.println("Saliendo...");
                break;
                
            }
        } while (resp != 8);
        
        
    }
}
