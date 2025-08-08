/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.controlador;

/**
 *
 * @author uriel
 */
public class ControladorEjercicioDos {
    public String[] obtenerCadenasConO(String[][] arreglo) {
        String resultado = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j].toLowerCase().startsWith("o")) {
                    resultado += arreglo[i][j] + ",";
                }
            }
        }
        return resultado.isEmpty() ? new String[]{} : resultado.split(",");
    }
    
    public String[] obtenerCadenasConTodasVocales(String[][] arreglo) {
        String resultado = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                String palabra = arreglo[i][j].toLowerCase();
                if (palabra.contains("a") && palabra.contains("e") && palabra.contains("i") 
                        && palabra.contains("o") && palabra.contains("u")) {
                    resultado += arreglo[i][j] + ",";
                }
            }
        }
        return resultado.isEmpty() ? new String[]{} : resultado.split(",");
    }
    
    public String[] obtenerCadenasConSa(String[][] arreglo) {
        String resultado = "";
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j].toLowerCase().contains("sa")) {
                    resultado += arreglo[i][j] + ",";
                }
            }
        }
        return resultado.isEmpty() ? new String[]{} : resultado.split(",");
    }
}
