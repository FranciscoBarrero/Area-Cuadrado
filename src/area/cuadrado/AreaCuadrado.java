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
       int lado;
       Scanner sc = new Scanner (System.in);
       lado=sc.nextInt();
   lado=lado*lado;
   System.out.println("el area del cuadrado es "+ lado);
 
    }
    
}
