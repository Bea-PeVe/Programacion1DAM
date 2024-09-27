/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad115;
import java.util.*;
/**
 *
 * @author gloria.perveg
 */
public class Actividad115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado el polinomio y = ax2 + bx + c
        crea un programa que */ 
        double a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para calcular el valor de 'y' en 'y = ax2 + bx + c'");
        System.out.println("Introduzca el valor de 'a': ");
        a = sc.nextDouble();
        System.out.println("Introduzca el valor de 'b': ");
        b = sc.nextDouble();
        System.out.println("Introduzca el valor de 'c': ");
        c = sc.nextDouble();
        System.out.println("Introduzca el valor de 'x': ");
        x = sc.nextDouble();
        //calculo valor y
        y = a*Math.pow(x,2) + b*x + c;
        System.out.println("El valor de 'y' es: " + y);
    }
    
}
