package EjerciciosUtilidad;

import java.util.Scanner;

public class Ejercicio1 {
  Scanner sc = new Scanner(System.in);
  Utilidades ut = new Utilidades();

  public void sueldo() {
    float total = 0.00f;
    float sueldo = 2500;
    float ValorMin = 10000;
    float AuxCom = 0;
    float Utilidad = 0;
    float AutoValorTot = 0;
    System.out.println("Programa que calcula el sueldo mensual de un empleado que vende automoviles");
    System.out.println("Ingrese el nombre del empleado");
    String nombre = sc.nextLine();
    System.out.println("Ingrese el numero de autos que vendio:");
    int AutosVendidos = sc.nextInt();
    for (int i = 1; i <= AutosVendidos; i++) {
      System.out.println("Ingrese el valor del auto vendido");
      float AutoVal = sc.nextFloat();
      AutoValorTot = AutoValorTot + AutoVal;
      Utilidad = Utilidad + (AutoVal * (float) 0.05);
      if (AutoVal >= ValorMin) {
        AuxCom = AuxCom + 250;
      }
    }
    total = sueldo + AuxCom + Utilidad;
    System.out.println("Empleado " + nombre);
    System.out.println("Autos vendidos: " + AutosVendidos);
    System.out.println("Valor total de los autos: $" + Utilidades.redondear(AutoValorTot));
    System.out.println("Sueldo mensual: $" + Utilidades.redondear(sueldo));
    System.out.println("Valor de comisiones: $" + Utilidades.redondear(AuxCom));
    System.out.println("Valor de la utilidad: $" + Utilidades.redondear(Utilidad));
    System.out.println("Total a pagar: $" + Utilidades.redondear(total));
  }
}
