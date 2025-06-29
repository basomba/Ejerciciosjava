/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

/**
 *
 * @author indianmachinery club
 */

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce la cantidad de pesetas que quieres convertir a euros");
        long pesetas = scanner.nextLong();
        double euros = pesetas / 166.386;
        System.out.print("la conversion de pesetas a euros que ingresaste es:" + euros);
        
        scanner.close();
        
    }
}
