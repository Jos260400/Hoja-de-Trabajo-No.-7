/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructura Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 7
 * Main.java
 */

// Importamos el paquete "Classes"
package Classes;

import Classes.BinaryTree;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        BinaryTree Arbolito= null;
        String Ingles = "";
        String Español = "";

        System.out.println("**************Menu**************");
        System.out.println("Escoge una opción");
        System.out.println("1. Diccionario");
        System.out.println("2. Traductor");
        System.out.println("3. Salir");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        while(opcion!=3) {

            if (opcion == 1) {
                System.out.println("El Diccionario");
                System.out.println();

            }
            if(opcion ==2) {
                System.out.println("Traductor");
                Ingles = teclado.nextLine();
                System.out.println("Ingresa una palabra en español: ");
                Español = teclado.nextLine();
            }

            else {
                System.out.println("Adios");
            }

        }

    }

    public static Map Leyendo (Map<String, String> map){

        try {
            System.out.println("-------------------------------------");
            Scanner read = new Scanner(new File("C:\\Users\\DARKTONE\\Desktop\\UVG\\Tercer Semestre\\Algoritmos\\Hoja de Trabajo No. 7\\src\\El_Diccionario.txt"));
            String Ingles ="";
            String Español ="";

            while((read.hasNextLine()))

            {

                String line = read.nextLine();
                int i = line.lastIndexOf(", ");
                Ingles = line.substring(0,i).trim();
                Español =line.substring(i+1).trim();

            }

        }

        catch (Exception ex) {
            ex.printStackTrace();
        }
        return map;

    }
}