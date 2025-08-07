/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author mag09
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }
    
    public static void mostrarMenuPrincipal(){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {            
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
                default:
                    System.out.println("Numero invalido");
            }
        } while (opcion != 0);
 
    }
    
    public static void ejercicio1(Scanner leer){
        int opcion;
    }
    public static void ejercicio2(Scanner leer){
        int opcion;
    }
}
