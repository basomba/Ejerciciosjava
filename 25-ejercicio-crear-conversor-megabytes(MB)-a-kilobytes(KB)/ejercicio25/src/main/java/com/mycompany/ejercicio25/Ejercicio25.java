/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25;
import java.util.Scanner;
/**
 *
 * @author indianmachinery club
 */
public class Ejercicio25 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese  la cantidad megabytes Mb que desea convertir");
        
        double Megabytes = scanner.nextDouble();
        double Kilobytes = Megabytes * 1024;
        
        System.out.print("la conversion de Megabytes a Kilobytes es: " + Kilobytes);
    }
}
