/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_prueba;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Ejercicio3_Prueba {

    
    public static void main(String[] args) {
        String productos="";
        Scanner entrada = new Scanner (System.in);
        int cantProductos=0,i=1,salir=1;
        int[] inventarioProductos;
        
        while(salir!=0){
        System.out.println("Ingrese el nombre de su producto" + i);
        productos = entrada.nextLine();
        i++;
        cantProductos++;
        System.out.println("Si desea salir ingrese 0");
        salir = entrada.nextInt();
        }
        System.out.println(productos);
        
        
        
    }
    
}
