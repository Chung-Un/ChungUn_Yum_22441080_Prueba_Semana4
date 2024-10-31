/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_prueba;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Ejercicio1_Prueba {

    public static void ingresarProducto(){
    System.out.print("Ingrese el nombre del");
    
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioProductos=0,total;
        int cantProductos; 
        
        System.out.println("Ingrese la cantidad de productos que desea ingresar: ");
        cantProductos = entrada.nextInt();
        
        for(int i=1; i<=cantProductos; i++){
        System.out.println("Ingrese el precio del " + (i+1) + " producto: ");
        precioProductos = precioProductos + entrada.nextDouble();
               
                }
        
        total = precioProductos;
        System.out.println("El precio total de la compra es: Lps." + total);
    }
    
}
