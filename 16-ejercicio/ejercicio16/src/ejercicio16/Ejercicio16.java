/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;

/**
 *
 * @author indianmachinery club
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner s = new Scanner(System.in);
 System.out.print( "ingrese el primer numero");
 double num1 = s.nextDouble();
 System.out.print("ingrese el segundo numero");
 double num2 = s.nextDouble();
 double multiplicacion = num1*num2;
 System.out.print("el resultadod de la multiplicacion es" + multiplicacion);
 s.close();
         

    }
    
}
