/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15ejercicio.leedatosscannermedia;

/**
 *
 * @author indianmachinery club
 */
import java.util.Scanner;

  Scanner s = new Scanner(System.in);
        try {
            System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");
            double x1 = s.nextDouble();
            double x2 = s.nextDouble();
            double x3 = s.nextDouble();
            double media = (x1 + x2 + x3) / 3;
            System.out.println("La media de esos tres números es " + media);
        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce solo números válidos.");
        } finally {
            s.close();
        }
   
    
    
}
}