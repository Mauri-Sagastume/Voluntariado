import java.util.Scanner;

public class Main {

    public static String usuario = "voluntariado";
    public static String contra = "123a";

    public static void main(String[] args) {

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese su Usuario");
            String user = input.nextLine();
            System.out.println("Ingrese su Contraseña");
            String contraseña = input.nextLine();

            if (user.equals(usuario) && contraseña.equals(contra)) {

                int opcion = 0;

                System.out.println("BIENVENIDO");

                System.out.println("--------Almuerzos Doña Mary-------");

                do{

                    System.out.println("----------Menu Principal-----------");
                    System.out.println();
                    System.out.println("1. Agregar Nuevos Productos");
                    System.out.println("2. Agregar Cupon de Descuento");
                    System.out.println("3. Realizar Ventas");
                    System.out.println("4. Reporte de Ventas");
                    System.out.println("5. Salir ");
                    System.out.println("Ingrese una opcion");
                    opcion= input.nextInt();

                    switch (opcion){

                        case 1:

                            System.out.println("Producto Agregado");


                            break;

                        case 29:
                        break;

                        case 2:

                            System.out.println("Cupon Agregado");
                            break;
                        case 5:
                            return;

                    }

                }while (opcion !=5 );


            }else{
                System.out.println("Su usuario no es valido");

            }

        }
    }
}