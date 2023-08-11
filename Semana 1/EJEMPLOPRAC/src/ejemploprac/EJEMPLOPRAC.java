
package ejemploprac;

import java.util.Scanner;
import java.util.Date;


public class EJEMPLOPRAC {

static Scanner sel = new Scanner(System.in); // Scanner declarado globalmente para poderlo utilizar en todo el programa
static String ingresoprod [][] = new String[Tamaño Filas][Tamaño Columnas]; //Corregir el tamaño de filar y columnas
static int i1 = 0;
static String revisionrepetidos;
static String ingresocupones [][] = new String[Tamaño Filas][Tamaño Columnas]; //Corregir el tamaño de filar y columnas
static int i2 = 0;
    
// Main 
    public static void main(String[] args) {
        
        Date fechasistema = new Date();
        System.out.println(fechasistema.toString());
        validacion(); 
        
    }
    
    //Método para la validación del usuario y contraseña
    static void validacion(){
        
       String nombre_usuario, contraseña; /* Variables que utilizaremos para que el
       usuario que maneje el programa pueda ingresar tanto el nombre usuario como contraseña
       */
        
       
       /*
       Dentro de este do-while está la opción para la validación de datos el cual nos permite 
       que se repita la opción de validación si el usuario que utiliza el programa ingresó 
       erroneamente el nombre de usuario o la contraseña
       */
       do{
           
        System.out.println("*************************************");
        System.out.println("*       BIENVENIDO A SUPER-25       *");
        System.out.println("*   Ingrese su nombre de usuario:   *");
        System.out.print("         "); nombre_usuario = sel.nextLine();
        System.out.println("*                                   *");
        System.out.println("*      Ingrese la contraseña:       *");
        System.out.print("         "); contraseña = sel.nextLine();
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.println("");
        
            if(nombre_usuario.equals("Ingresen condicion") && contraseña.equals("Ingresar Condición")){
            
            System.out.println("Bienvenído al Menú Principal");    
            menu1();
        }
           
           System.out.println(""); 
           System.out.println("Nombre de usuario o contraseña incorrecto, ingrese sus credenciales nuevamente");
           System.out.println("");
           
       }while(nombre_usuario != "cajero_201800979" && contraseña != "ipc1_201800979");
       
    }
    
    // Método para la creación del primer menú
    static void menu1(){
        
        // Para escoger la opción deseada en el menú
        int opcion;
        
        /*
        Mi primer swicth: Que está dentro de un ciclo do-while para que el menú no se cierre y se
        mantenga abierto hasta que el usuario no introduzca una opción válida del menú.
        */
        
        do{
            
            // Menú mostrado en consola
            System.out.println("******************************************");
            System.out.println("*                SUPER-25                *");
            System.out.println("* 1. Agregar nuevos productos            *");
            System.out.println("* 2. Agregar cupones de descuento        *");
            System.out.println("* 3. Realizar ventas                     *");
            System.out.println("* 4. Realizar reporte                    *");
            System.out.println("* 5. Salir                               *");
            System.out.println("******************************************");
            
            System.out.print("Escoja la opción que desee: " );
            opcion = sel.nextInt();
            
            // switch del menú principal
            switch(opcion){
                case 1:
                    //ingresovariosproduc();
                    break;
                    
                case 2:
                    //varioscupones();
                    break;
                    
                case 3:
                    //ventas();
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    System.out.println("Qué tenga un excelente día");
                    System.exit(0);
                    
                    break;
                    
                default:
                   System.out.println("Opción inválida, ingrese una opción váida");
            }
        }while(opcion!=5);
    
}
    
}
