/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioleedatosscanner01.java;
import java.util.Scanner;
/**
 *
 * @author indianmachinery club
 */
public class App {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("introduce tu nombre y tu edad");
        String nombre = s.nextLine();
        System.out.print("introduce tu edad");
        int numero = s.nextInt();
        System.out.print("su nombre es" + " " +nombre +  " "+"y su edad es:" +numero);
        
        
    }
}
