/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;

import java.util.Scanner;

/**
 *
 * @author indianmachinery club
 */
public class Ejercicio24 {

    public static void main(String[] args) {
    
        
       Scanner scanner = new Scanner(System.in);
       System.out.print("ingrese el ratio del cono(r)");
       
       double radio = scanner.nextDouble();
       
       System.out.print("ingrese la altura del cono(h)");
       double altura = scanner.nextDouble();
        
       double volumen = (1.0 / 3.0) * Math.PI* Math.pow(radio,2)*altura;
       
       System.out.print("el volumen del cono es:" + volumen);
       
       scanner.close();
        
        
        
        
    }
}
