/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto6;

import java.util.Scanner;
 
public class PUNTO6 {
 
    public static void main(String[] args) {
         //Se crea el objeto para la clase Scanner
        Scanner Leer=new Scanner(System.in);
         
        //imprime el mesaje 
        System.out.println("Escriba una frase : ");
         
        //Se crea la variable frase que es igual al objeto  de entrada
        String frase=Leer.next(); 
         
        //creamos un array con un metodo String
        char caracteres[]=frase.toCharArray();
         
        //Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for(int i=0;i<frase.length();i++){
            //Se imprime por letra
            System.out.println(caracteres[i]);
        }
         
    }
     
}
