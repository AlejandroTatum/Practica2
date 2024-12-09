package EjerciciosUtilidad;

import java.util.Scanner;

    public class Ejercicio4 {
    Scanner sc = new Scanner(System.in);
    public static int a = 1;
    public static int b = 0;
    public static int f = 1;

    public int fibo() {
        f = a + b;
        a = b;
        b = f;
        return b;
    }

    public void ejecutar() {
        System.out.println("Escriba el numero de terminos a mostrar:");
        int numTerm = sc.nextInt();
        int par = 2;
        int impar = 1;
        int signo = 1;
        float aux = 0;
        int contSigno = 1;
        for (int i = 0; i < numTerm; i++) {
            int b = fibo();
            if (contSigno > 2) {
                signo = signo * (-1);
                contSigno = 1;
            }
            contSigno++;
            String result = ("["+(b * signo) + "/" + impar + "^" + par+"] ");
            System.out.print(result);
            float base = (b*signo)/impar;
            float resultF = (float) Math.pow(base, par);
            par = par + 2;
            impar = impar + 2;
            aux = aux+resultF;

        }
        System.err.println("El resultado de la serie es " +Utilidades.redondear(aux));

    }

}
