/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad117;
import java.util.*;
/**
 *
 * @author gloria.perveg
 */
public class Actividad117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora centímetros
         double miliMetros, centiMetros, metros, centiMetros1Totales;
        System.out.println("Calculadorasuma distancias");
        Scanner sc = new Scanner(System.in);
        System.out.println("Para empezar indicame una distancia en milímetros:");
        miliMetros = sc.nextInt();
        System.out.println("Para empezar indicame una distancia en centímetros:");
        centiMetros = sc.nextInt();
        System.out.println("Para empezar indicame una distancia en metros:");
        metros = sc.nextInt();
        miliMetros/=100;
        metros*=100;
        centiMetros1Totales = miliMetros + centiMetros + metros;
        System.out.println("La suma total es de: " + centiMetros1Totales + " cm");
    }
    
}
