package View;

import java.util.Scanner;

import EjerciciosUtilidad.Ejercicio1;
import EjerciciosUtilidad.Ejercicio2;
import EjerciciosUtilidad.Ejercicio3;
import EjerciciosUtilidad.Ejercicio4;

public class MainPractica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--MENU PRACTICA--");
        System.out.println("Ingrese una opcion");
        System.out.println("1.Informe automoviles");
        System.out.println("2.Facturacion de agua");
        System.out.println("3.Calcula el valor de llamadas internacionales");
        System.out.println("4.Sucesion numerica");
        System.out.println("5.Salir del menu");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                Ejercicio1 e1 = new Ejercicio1();
                e1.sueldo();
                break;
            case 2:
                Ejercicio2 e2 = new Ejercicio2();
                e2.ejecutar();
                break;
            case 3:
                Ejercicio3 e3 = new Ejercicio3();
                e3.ejecutar();

                break;
            case 4:
                Ejercicio4 e4 = new Ejercicio4();
                e4.ejecutar();
                break;
            case 5:

                break;

            default:
                break;
        }
        sc.close();
    }

}
