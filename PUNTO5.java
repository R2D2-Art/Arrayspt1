/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto5;
//se importa la clase Scanner
import java.util.Scanner;
public class PUNTO5 {
 
    public static void main(String[] args) {
        //creamos un objetp para la clase Scanner y definimos en tipo de entra es 
        Scanner Leer = new Scanner(System.in);
        
        //creamos una variable eleccion que va a ser igual a -1
        int eleccion = -1;
   
        //Utilizamos tipo char como entero pequeño y el tamaño
        int Numero[] = new int[26];
        
        //bucle se crea la variable i y j se le da su valor 
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            
            Numero[j] = (int) i;
        }
        //bucle donde continuara hasta que no se cumpla la condicion
        do {
            System.out.println("Elija un indice entre 0 y " + (Numero.length - 1));
            //El objeto de la clase Scanner va a ser igual a la variable eleccion
            eleccion = Leer.nextInt();

            //se hace un condicion la cual define lo que se asigna si llega a ser true
            if (!(eleccion >= 0 && eleccion <= Numero.length )) {
                System.out.println("Error, inserte otro numero");

            } 
         //utilizamos que si se cumple la condicionio se asigna lo que este dentro de ella en est e caso un mensaje 
         //que romperia el buble ya de por si 
        } while (eleccion != -1);
 
        System.out.println("");
 
    }
 
}

