/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("digite el valor de uno de los lados del cuadrado");
       int lado;
       Scanner sc = new Scanner (System.in);
       lado=sc.nextInt();
   lado=lado*lado;
   System.out.println("El area del cuadrado es "+ lado);
        System.out.println("Digite el valor de uno de los lados del cuadrado");
   int lados;
   Scanner ac = new Scanner (System.in);
   lados=ac.nextInt();
   lados=lados*4;
        System.out.println("El perimetro del cuadrado es "+ lados);
   
 
    }
    
}
