/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leedatosscanner.java;
import java.util.Scanner;
/**
 *
 * @author indianmachinery club
 */
public class LeedatosscannerJava {

    public static void main(String[] args) {
   
    
        Scanner s = new Scanner(System.in);
        System.out.print("introdusca su nombre");
        String nombre = s.nextLine();
        
        System.out.print("introdusca su edad");
        int edad = Integer.parseInt(s.nextLine());
        
        System.out.print(" " + "el nombre introducido es:" + " " + nombre + " " +"y la edad introducida es " + edad);
        
    }
}
