/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Util;

import Controller.Util.Ejercicio3;
import java.util.Scanner;

/**
 *
 * @author kathe
 */
public class Ejercicio3 {
    
 
    private int filasCasa = 10;
    private int columnasCasa = 3;
    private float casas[][] = new float[filasCasa][columnasCasa];

    public float[][] getCasas() {
        return casas;
    }

   /* public void setCasas(Float[][] casas) {
        this.casas = casas;
    }*/

    public Ejercicio3() {
    }
      // recorrer la columna
    void igualLongitud (int columna){
        for(int i=0; i<columna; i++){
        
    }
    }
    
    public void llenadoDatos(int filasCasa, int columnasCasa, float casa [][]){
        for (int i = 0; i < filasCasa; i++) {
            for (int j = 0; j < columnasCasa; j++) {
                casa[i][j] = (float) (Math.random() * 10);
            }
        }
        for (int i = 0; i < filasCasa; i++) {
            System.out.println("Matriz" +(i+1));
            for (int j = 0; j < columnasCasa; j++) {
                System.out.print("["+casa[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    
    public boolean igualesFilas (Float[]casa1, Float [] casa2){
        Boolean homonimas = false;
        for (int i =0 ; i < casa1.length ; i++) {
            if (casa1[i].equals(casa2[i])) {
                homonimas = true;
            }
        }
        return homonimas;
    }
    
     public void sonHomonimas(float [][] casas){
         boolean homonimas = false;
         for (int i = 0; i < casas.length; i++) {
            for (int j = i + 1; j < casas.length; j++) {
                if (casas[i][0] == casas[j][0] && 
                    casas[i][1] == casas[j][1] && 
                    casas[i][2] == casas[j][2]) { 
                    homonimas = true;
                    
                }

     }
            
            
            
            
    /*public int compararCasas (){
        int[] contadores = new int[casas.length];
        for (int i = 0; i < casas.length; i++) {
            for (int j = 1; j < casas.length; j++) {
                if (igualesFilas(casas[i], casas[j])) {
                    contadores[i]++;
                    contadores[j]++;
                }
            }
        }
        
        return ;
    }*/
    
    }}}

      
        