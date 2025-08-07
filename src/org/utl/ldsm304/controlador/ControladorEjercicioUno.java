/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.controlador;

/**
 *
 * @author mag09
 */
public class ControladorEjercicioUno {
        
    
    public int obtenerMasRepetido(int[][] arreglo) {
        int numeroMasRepetido = -1;
        int maxRepeticiones = 0;
           
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                int repeticiones = contarRepeticiones(arreglo, arreglo[i][j]);
                if (repeticiones > maxRepeticiones) {
                    maxRepeticiones = repeticiones;
                    numeroMasRepetido = arreglo[i][j];
                }
            }
        }
        return numeroMasRepetido;
    }

    public int contarRepeticiones(int[][] arreglo, int numero) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] == numero) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public int obtenerPares(int[][] arreglo) {
        int cantidadPares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    cantidadPares++;
                }
            }
        }
        return cantidadPares;
    }
    
    public int obtenerImpares(int[][] arreglo) {
        int cantidadImpares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 != 0) {
                    cantidadImpares++;
                }
            }
        }
        return cantidadImpares;
    }
 
    public int obtenerSumaDiagonal(int[][] arreglo) {
        int sumaDiagonal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaDiagonal += arreglo[i][i]; // Sumar los valores de la diagonal
        }
        return sumaDiagonal;
    }

    public int obtenerMultiplosde5(int[][] arreglo) {
        int cantidadMultiplosDe5 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 5 == 0) {
                    cantidadMultiplosDe5++;
                }
            }
        }
        return cantidadMultiplosDe5;
    }  
}
