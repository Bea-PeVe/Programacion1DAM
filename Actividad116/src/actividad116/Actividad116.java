/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad116;
import java.util.*;

/**
 *
 * @author gloria.perveg
 */
public class Actividad116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calculadora sexagesimal
        int segIntroducidos, horas, mins, seg;
        System.out.println("Calculadora de Horas, minutos y segundos");
        Scanner sc = new Scanner(System.in);
        System.out.println("Para empezar indicame una cantidad de segundos");
        segIntroducidos = sc.nextInt();
        seg = segIntroducidos%60;
        mins = segIntroducidos/60;
        horas = mins/60;
        mins %=60;
        System.out.println("El tiempo total indicado es de: " + horas + ":" +  mins + ":" + seg);
        System.out.println(horas + " horas, " + mins + " minutos y " + seg + " segundos");
    }
    
}
