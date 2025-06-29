/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leenumeros.java;

import static java.lang.System.out;

/**
 *
 * @author indianmachinery club
 */
public class LeenumerosJava {

    public static void main(String[] args) {
        
        
       String linea;
       System.out.print("ingrese el primer numero");
       linea = System.console().readLine();
       int primernumero;
       primernumero = Integer.parseInt(linea);
       
       System.out.print("ingrese el segundo numero");
       linea = System.console().readLine();
       int segundonumero;
       segundonumero = Integer.parseInt(linea);
       
       
       int total;
       total = (primernumero * 2)+ segundonumero;
       
       System.out.print("el primer numero introducido es " + primernumero);
       System.out.print(" " +  "el doble del primero mas el segundo numero introducido es" + " ");
       System.out.print( total);
    }
}













