/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20;

/**
 *
 * @author indianmachinery club
 */

import java.util.Scanner;
public class Ejercicio20 {

    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingresa la base del triangulo");
    double base = scanner.nextDouble();
    System.out.print("ingrese la base del triangulo");
    double altura = scanner.nextDouble();
    double areas = (base*altura)/2;
    System.out.print("las areas de un triangulo son:" + areas);
    
    scanner.close();
    }
}
