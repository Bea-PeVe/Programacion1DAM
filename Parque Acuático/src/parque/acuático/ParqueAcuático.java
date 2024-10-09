/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parque.acuático;
import java.util.*;
/**
 *
 * @author gloria.perveg
 */
public class ParqueAcuático {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Calculadora importe entradas (cuyo número será introducido por el usuario). 
        Existen dos tipos de entrada: infantiles, que cuestan 15,50 euros, y de adultos, que cuestan 20 euros.
        En el caso de que el importe total sea igual o superior a 100 euros, se aplicará automáticamente un bono descuento del 5 %. */
        System.out.println("¡Hola! ¡Bienvenidos a parques acuáticos!");
        // Declaramos las variables
        double entAdu, entNiñ, total, descuento;
        int numAdul, numNiñ;
        // Declaramos que vamos a pedir un dato por teclado
        Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuántos niños vienen a pasárselo en grande? (Introduce un número entero)");
                numNiñ = sc.nextInt();
            System.out.println("¿Cuántos adultos nos acompañan hoy?");
                numAdul = sc.nextInt();
        // Calculamos el precio según datos
        entAdu = numAdul * 20.0;
        entNiñ = numNiñ * 15.50;
        total = entAdu + entNiñ;
        // Aplicamos el descuento si el total es igual o superior a 100 euros
        if (total >= 100) {
            descuento = total * 0.05;
            total = total - descuento;
        }
        // Mostramos el total a cobrar
        System.out.println("El total de la diversión es: " + total + "€");
    }
    
}
