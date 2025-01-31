/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Util;
/**
 *
 * @author Alejandro Padilla
 */
public class OperadorMatrices {

    public int valorColumnas;
    public int valorFilas;
    private int matriz_uno[][];
    public OperadorMatrices(){
    }
    

    public OperadorMatrices(int valorColumnas, int valorFilas) {
        this.valorColumnas = valorColumnas;
        this.valorFilas = valorFilas;
    }

    public int[][] getMatriz_uno() {
        return matriz_uno;
    }

    public void setMatriz_uno(int[][] matriz_uno) {
        this.matriz_uno = matriz_uno;
    }

    public int getValorColumnas() {
        return valorColumnas;
    }

    public void setValorColumnas(int valorColumnas) {
        this.valorColumnas = valorColumnas;
    }

    public int getValorFilas() {
        return valorFilas;
    }

    public void setValorFilas(int valorFilas) {
        this.valorFilas = valorFilas;
    }

    public void metodoLlenadoMatrices() {
        //Llenado de la primer matriz
        matriz_uno = new int [valorFilas][valorColumnas];
        for (int i = 0; i < valorFilas; i++) {
            for (int j = 0; j < valorColumnas; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 10);
            }
        }
    }
}
