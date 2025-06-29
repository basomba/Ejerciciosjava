/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author indianmachinery club
 */
public class Ejercicio17 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.print("ingresa el segundo numero");
        double num2 = scanner.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = 0;
        
        if(num2 !=0){
            division = num1/num2;
            
            }else{
            System.out.print("no se puede dividir");
            
        }
        System.out.print("la suma es" + suma);
        System.out.print("la resta"  + resta);
        System.out.print("la multiplicacion es"+ multiplicacion);
        
        
    scanner.close();
        
    }
}
