/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_prueba;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Ejercicio2_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double consumoMensual=0, promedioMensual, consumoTotal;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese su consumo mensuald de agua en litros durante los ultimos 12 meses");
        
        for(int i=0; i<12; i++){
        System.out.println("Mes " + (i+1));
        consumoMensual = consumoMensual + entrada.nextDouble();
        }
        
        consumoTotal = consumoMensual;
        promedioMensual = consumoTotal/12;
        
        System.out.println("Su consumo total anual es: " + consumoTotal + " litros de agua");
        System.out.println("Su promedio mensual es: " + promedioMensual + " litro de agua al mes");
           
        
        


    }
    
}
