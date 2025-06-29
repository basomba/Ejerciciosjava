/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baseimponible;

import java.util.Scanner;
/**
 *
 * @author indianmachinery club
 */
public class Baseimponible {

    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in);

System.out.print("introcuce la base impinible");
double baseimponible = scanner.nextDouble();

double porcentajedeiva = 21.1;

double iva = (porcentajedeiva / 100)*baseimponible;

double factura = baseimponible + iva;

System.out.print("la base imponible es:" + baseimponible);
System.out.print("el iva es" + iva);
System.out.print("el total de la factura es:" + factura);

        
         scanner.close();      
        
        
    }
}
