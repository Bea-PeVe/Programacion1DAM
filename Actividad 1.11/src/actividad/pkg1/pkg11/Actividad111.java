/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg1.pkg11;
import java.util.*;

/**
 *
 * @author gloria.perveg
 */
public class Actividad111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("Hola mundo");
        //Programa para calculos con el IVA
        //Definición de valores
     
     double baseImponible, valorBruto, valorNeto,importeImpuesto;
     Scanner sc = new Scanner(System.in);
     System.out.println("Indique la base imponible a aplicar:");
     System.out.println("*Recuerde: IVA GENERAL es: 21/IVA_REDUCIDO es: 10/IVA_SUPEREDUCIDO es: 4/IGIC_GENERAL es: 7/IGIC_REDUCIDO es: 3");
     baseImponible = sc.nextInt();
     System.out.println("Introduzca el importe: ");
     valorBruto = sc.nextDouble();
     importeImpuesto = (valorBruto * baseImponible)/100;
     valorNeto = valorBruto + importeImpuesto;
     System.out.println("El importe del impuesto a aplicar es: " + importeImpuesto); 
     System.out.println("El valor total es: " + valorNeto);      
    }
    
}
