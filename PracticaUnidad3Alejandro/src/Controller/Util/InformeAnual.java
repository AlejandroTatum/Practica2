/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Util;

import Vista.VistaInformeAnual;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.nio.file.Files.size;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alejandro Padilla
 */
public class InformeAnual {

    public String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    private float gastos[] = new float[12];
    private float ventas[] = new float[12];
    private int anio;

    public void choose() {
    JFileChooser fc = new JFileChooser();
    fc.setFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
    int result = fc.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int index = 0;
            for (int i = 0; i < 12 && (line = br.readLine()) != null; i++) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] valores = line.split(",");
                    if (valores.length == 2) {
                        try {
                            ventas[i] = Float.parseFloat(valores[0].trim());
                            gastos[i] = Float.parseFloat(valores[1].trim());
                        } catch (NumberFormatException e) {
                            System.out.println("No se pudo convertir: " + line);
                        }
                    } else {
                        System.out.println("Línea con formato incorrecto: " + line);
                    }
                }
            }
            JOptionPane.showMessageDialog(fc, "Datos guardados correctamente");
            

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    } else {
        System.out.println("No se seleccionó ningún archivo.");
    }
}


    public float[] getVentas() {
        return ventas;
    }

    public float[] getGastos() {
        return gastos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public InformeAnual(float[] gastos, float[] ventas) {
        this.gastos = gastos;
        this.ventas = ventas;
    }

    public InformeAnual() {
    }

    public void setGastos(float[] gastos) {
        this.gastos = gastos;
    }

    public void setVentas(float[] ventas) {
        this.ventas = ventas;
    }

    public void metodoIngresoDatos(float gasto, float venta, int mes) {
        gastos[mes] = gasto;
        ventas[mes] = venta;
    }

    public float metodoSumarVentas() {
        float totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        return totalVentas;
    }

    public float metodoSumarGastos() {
        float totalGastos = 0;
        for (int i = 0; i < gastos.length; i++) {
            totalGastos += gastos[i];
        }
        return totalGastos;
    }

    public String metodoMesVentaMasBaja() {
        int mesBajo = 0;
        float ventaBaja = ventas[0];

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < ventaBaja - 1) {
                ventaBaja = ventas[i];
                mesBajo = i;
            }
        }
        return meses[mesBajo];
    }

    public String metodoMesVentaMasAlta() {
        int mesAlto = 0;
        float ventaAlta = ventas[0];

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventaAlta) {
                ventaAlta = ventas[i];
                mesAlto = i;
            }
        }
        return meses[mesAlto];
    }

    public float metodoVentaMasAlta() {
        float maxVenta = ventas[0];

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > maxVenta) {
                maxVenta = ventas[i];
            }
        }
        return maxVenta;
    }

    public float metodoVentaMasBaja() {
        float minVenta = ventas[0];

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < minVenta) {
                minVenta = ventas[i];
            }
        }
        return minVenta;
    }

    public float promedioVentas() {
        float totalVentas = metodoSumarVentas();
        return totalVentas / ventas.length;
    }

}
