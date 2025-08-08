/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otg.utl.ldsm304.vista;

import java.util.Scanner;
import org.utl.ldsm304.controlador.ControladorEjercicioUno;
import org.utl.ldsm304.controlador.ControladorEjercicioDos;

public class Menu {
    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }
    
    public static void mostrarMenuPrincipal(){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {      
            System.out.println("");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("0. Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    ejercicio1(leer);
                    break;
                case 2:
                    ejercicio2(leer);
                    break;    
                case 0: 
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Numero invalido");
                    break;
            }
        } while (opcion != 0);
    }
    
    public static void ejercicio1(Scanner leer){
        int[][] tallas = {
            {5, 3, 5, 2},
            {6, 5, 7, 8},
            {5, 8, 9, 10},
            {2, 5, 3, 7}
        };  
        ControladorEjercicioUno cu = new ControladorEjercicioUno();
        char opcion = 'z';

        do {       
            System.out.println("");
            System.out.println("Menu Ejercicio 1");
            System.out.println("a. Talla que mas se repite");
            System.out.println("b. Tallas que son par");
            System.out.println("c. Tallas que son impar");
            System.out.println("d. Suma de tallas de diagonal");
            System.out.println("e. Tallas que son multiplos de 5");
            System.out.println("z. Salir");
            opcion = leer.next().charAt(0);
            switch (opcion) {
                case 'a':
                    int masRepetido = cu.obtenerMasRepetido(tallas);
                    System.out.println("La talla que mas se repite es: " + masRepetido);
                    break;
                case 'b':
                    int cantidadPares = cu.obtenerPares(tallas);
                    System.out.println("Cantidad de tallas pares: " + cantidadPares);
                    break;
                case 'c':
                    int cantidadImpares = cu.obtenerImpares(tallas);
                    System.out.println("Cantidad de tallas impares: " + cantidadImpares);
                    break;
                case 'd':
                    int sumaDiagonal = cu.obtenerSumaDiagonal(tallas);
                    System.out.println("Suma de tallas en la diagonal: " + sumaDiagonal);
                    break;
                case 'e':
                    int multiplosDe5 = cu.obtenerMultiplosde5(tallas);
                    System.out.println("Cantidad de tallas multiplos de 5: " + multiplosDe5);
                    break;    
                case 'z': 
                    System.out.println("Saliendo del ejercicio 1");
                    break;
                default:
                    System.out.println("Letra invalido");
                    break;
            }
        } while (opcion != 'z');
    }
    
    public static void ejercicio2(Scanner leer){
        String[][] cadenas = {
            {"oso", "casa", "murcielago"},
            {"oruga", "salado", "queso"},
            {"osoide", "universo", "salsa"}
        };
        ControladorEjercicioDos ce2 = new ControladorEjercicioDos();
        char opcion = 'z';
        
        do {
            System.out.println("");
            System.out.println("Menu Ejercicio 2");
            System.out.println("a. Cadenas que comienzan con la letra 'o'");
            System.out.println("b. Cadenas que tienen las 5 vocales");
            System.out.println("c. Cadenas que contienen la silaba 'sa'");
            System.out.println("z. Salir");
            opcion = leer.next().charAt(0);
            switch (opcion) {
                case 'a':
                    String[] conO = ce2.obtenerCadenasConO(cadenas);
                    if (conO.length == 0) System.out.println("Sin resultados");
                    for (String s : conO) System.out.println(s);
                    break;
                case 'b':
                    String[] conVocales = ce2.obtenerCadenasConTodasVocales(cadenas);
                    if (conVocales.length == 0) System.out.println("Sin resultados");
                    for (String s : conVocales) System.out.println(s);
                    break;
                case 'c':
                    String[] conSa = ce2.obtenerCadenasConSa(cadenas);
                    if (conSa.length == 0) System.out.println("Sin resultados");
                    for (String s : conSa) System.out.println(s);
                    break;  
                case 'z': 
                    System.out.println("Saliendo del ejercicio 2");
                    break;
                default:
                    System.out.println("Letra invalido");
                    break;
            }
        } while (opcion != 'z');
    }
}
