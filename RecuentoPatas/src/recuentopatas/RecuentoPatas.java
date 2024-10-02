/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuentopatas;
import java.util.*;
/**
 *
 * @author gloria.perveg
 */
public class RecuentoPatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Informamos al UF de la utilidad del programa.
        System.out.println("¡Hola! Aquí podrás calcular el número de patas de los insectos capturados.");
        //Declaramos las variables enteras.
          int hormigas, patasHormigas, arañas, patasAraña, cochinillas, patasCochinilla, patasTotales;
        //Declaramos que se van a introducir datos por el teclado.          
        Scanner sc = new Scanner(System.in);
        //Solicitamos al UF que introduzca las datos y los almacenamos.
        System.out.println("Introduzca las hormigas capturadas: ");
        hormigas = sc.nextInt();
        System.out.println("Introduzca las arañas capturadas: ");
        arañas = sc.nextInt();
        System.out.println("Introduzca las cochiniññas capturadas: ");
        cochinillas = sc.nextInt();
        /*Calculamos el número de patas según datos:
        El número de hormigas capturadas (6 patas).
        El número de arañas capturadas (8 patas).
        El número de cochinillas capturadas (14 patas).
        La aplicación debe mostrar el número total de patas.*/
        patasHormigas = hormigas*6;
        patasAraña = arañas*8;
        patasCochinilla = cochinillas*14;                
        patasTotales = (patasHormigas + patasAraña + patasCochinilla);
        System.out.println("Las patas de cada especie son: hormigas: "+ patasHormigas + ", arañas: " + patasAraña + "  y cochinillas: "+ patasCochinilla);
        System.out.println("El total de patas es: "+ patasTotales);
    }
    
}
