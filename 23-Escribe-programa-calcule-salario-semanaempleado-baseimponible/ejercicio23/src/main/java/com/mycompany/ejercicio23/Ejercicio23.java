/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;
import java.util.Scanner;
/**
 *
 * @author indianmachinery club
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese la cantidad de horas trabajas");
        
        
        double horastrabajadas = scanner.nextDouble();
        
        double salario = 12.0;
        
        
        double salariosemanal = horastrabajadas * salario;
        
        System.out.print("el salario es" + salariosemanal);
        
        scanner.close();
        
        
    }
}
