package EjerciciosUtilidad;

import java.util.Scanner;


public class Ejercicio2 {
    Utilidades ut = new Utilidades();
    Scanner sc = new Scanner(System.in);
    float valorBase = 3;
    float recoleccion = 0.75f;
    float datos = 0.5f;
    float impuesto = 0.35f;

    public float aguaPersona(float consAgua) {
        float valor = 0;
        float alcantarillado = 0;
        float total = 0;
        if (consAgua >= 0 && consAgua <= 15) {
            alcantarillado = valorBase * impuesto;
            valor = valorBase;
        }
        if (consAgua > 15 && consAgua <= 25) {
            valor = (consAgua - 15) * 0.10f + valorBase;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 25 && consAgua <= 40) {
            valor = (consAgua - 15) * 0.20f + valorBase;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 40 && consAgua <= 60) {
            valor = (consAgua - 15) * 0.30f + valorBase;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 60) {
            valor = (consAgua - 15) * 0.35f + valorBase;
            alcantarillado = valor * impuesto;

        }
        return total = valor + alcantarillado + recoleccion + datos;
    }

    public float aguaPersonaTerceraEdad(float consAgua) {
        float valor = 0;
        float alcantarillado = 0;
        float total = 0;
        float descuentoMax = 0.50f;
        float descuentoMin = 0.30f;
        if (consAgua >= 0 && consAgua <= 15) {
            alcantarillado = valorBase * impuesto;
            valor = valorBase * descuentoMax;
        }
        if (consAgua > 15 && consAgua <= 25) {
            valor = (consAgua - 15) * 0.10f + valorBase * descuentoMin;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 25 && consAgua <= 40) {
            valor = (consAgua - 15) * 0.20f + valorBase * descuentoMin;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 40 && consAgua <= 60) {
            valor = (consAgua - 15) * 0.30f + valorBase * descuentoMin;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 60) {
            valor = (consAgua - 15) * 0.35f + valorBase * descuentoMin;
            alcantarillado = valor * impuesto;

        }
        return total = valor + alcantarillado + recoleccion + datos;
    }

    public float aguaPersonaDiscapacitada(float consAgua, int porcenDiscapacidad) {
        float valor = 0;
        float alcantarillado = 0;
        float total = 0;
        float descuento = porcenDiscapacidad / 100;
        if (consAgua >= 0 && consAgua <= 15) {
            alcantarillado = valorBase * impuesto;
            valor = valorBase * descuento;
        }
        if (consAgua > 15 && consAgua <= 25) {
            valor = (consAgua - 15) * 0.10f + valorBase * descuento;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 25 && consAgua <= 40) {
            valor = (consAgua - 15) * 0.20f + valorBase * descuento;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 40 && consAgua <=60) {
            valor = (consAgua - 15) * 0.30f + valorBase * descuento;
            alcantarillado = valor * impuesto;
        }
        if (consAgua > 60) {
            valor = (consAgua - 15) * 0.35f + valorBase * descuento;
            alcantarillado = valor * impuesto;

        }
        return total = valor + alcantarillado + recoleccion + datos;
    }

    public void ejecutar() {
        String discapString = "";
        String terceraString = "";
        String si = "si";
        float consAgua = 0;
        System.out.println("Programa para el cobro de planillas de agua");
        System.out.println("Es una persona de la tercera edad?(responda si o no)");
        terceraString = sc.next().toLowerCase();
        if (terceraString.equals(si)) {
            System.out.println("Ingrese su consumo de agua");
            consAgua = sc.nextFloat();
            System.out.println("El valor del consumo de agua de este mes es de: $" + aguaPersonaTerceraEdad(consAgua));
        } else {
            System.out.println("Es una persona discapacitada ?(responda si o no)");
            discapString = sc.next().toLowerCase();
            if (discapString.equals(si)) {
                System.out.println("Ingrese su porcentaje de discapacidad:");
                int porcenDiscapacidad = sc.nextInt();
                System.out.println("Ingrese su consumo de agua");
                consAgua = sc.nextFloat();
                System.out.println("El valor del consumo de agua de este mes es de: $"+ aguaPersonaDiscapacitada(consAgua, porcenDiscapacidad));
            } else {
                System.out.println("Ingrese su consumo de agua");
                consAgua = sc.nextFloat();
                System.out.println("El valor del consumo de agua de este mes es de: $" + aguaPersona(consAgua));
            }

        }
    }
}
