package EjerciciosUtilidad;

import java.util.Scanner;

public class Ejercicio3 {
    Scanner sc = new Scanner(System.in);

    public enum telefono {
        AMERICANORTE(12, 2.75), AMERICACENTRAL(15, 1.89), AMERICASUR(18, 1.60), EUROPA(19, 3.50), ASIA(23, 4.50),
        AFRICA(25, 3.1), OCEANIA(29, 3), MUNDO(31, 6);

        final int clave;
        final double valor;

        telefono(int clave, double valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    public void ejecutar() {
        System.out.println("Ingrese la region a la que desea llamar");
        for (telefono value : telefono.values()) {
            System.out.print(value + " ");
            System.out.println(value.clave);
        }
        System.out.println("Ingrese la clave de su destino:");
        int claveDestino = sc.nextInt();
        System.out.println("Ingrese cuantos minutos desea hablar:");
        int minutos = sc.nextInt();
        for (telefono value : telefono.values()) {
            if (value.clave == claveDestino) {
                System.out.println("El valor a pagar es de: $" + value.valor * minutos);
            }
        }

    }
}
