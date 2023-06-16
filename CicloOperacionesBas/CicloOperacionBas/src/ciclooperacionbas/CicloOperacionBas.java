/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclooperacionbas;

import java.util.Scanner;

/**
 *
 * @author xaxbe
 */


public class CicloOperacionBas {
    
    public void CIOPBAS(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú de Operaciones Básicas -----");
            System.out.println("1. Realizar suma");
            System.out.println("2. Realizar resta");
            System.out.println("3. Realizar multiplicación");
            System.out.println("4. Realizar división");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);
        
        sc.close();
    }

    public static void realizarSuma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            suma += numero;
        }

        System.out.println("Suma: " + suma);
        System.out.println("--------------------------------------");
    }

    public static void realizarResta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();
        int resta = numero1 - numero2;

        System.out.println("Resta: " + resta);
        System.out.println("--------------------------------------");
    }

    public static void realizarMultiplicacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a multiplicar: ");
        int n = sc.nextInt();
        int producto = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            producto *= numero;
        }

        System.out.println("Multiplicación: " + producto);
        System.out.println("--------------------------------------");
    }

    public static void realizarDivision() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            double division = (double) dividendo / divisor;
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        System.out.println("--------------------------------------");
        
    }
    public static void main(String[] args) {
        CicloOperacionBas Ciclos = new CicloOperacionBas();
        Ciclos.CIOPBAS();
    }
}
