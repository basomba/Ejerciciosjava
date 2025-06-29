/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.leedatosscanner2.java;

/**
 *
 * @author indianmachinery club
 */

import java.util.Scanner;

public class LeeDatosScanner2Java {

    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
         System.out.print("introduce tu nombre con espacio separado de tu edad" + " ");
         String nombre = s.next();
         int edad = s.nextInt();
         System.out.print(" " + "el nombre ingresado es" + " " +nombre + " y la edad ingresada es " + edad);
            
        
    }
}
