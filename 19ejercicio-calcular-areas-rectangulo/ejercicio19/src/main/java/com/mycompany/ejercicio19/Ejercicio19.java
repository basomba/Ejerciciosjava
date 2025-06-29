/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;
import java.util.Scanner;
/**
 *
 * @author indianmachinery club
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la base del rectangulo");
        double base = scanner.nextDouble();
        System.out.print("ingrese la altura");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.print("las areas de rectangulo ingresadas son:" + area);
        scanner.close();
    }
}
