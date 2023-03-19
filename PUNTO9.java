/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto9;
//importamos clase Scanner 
import java.util.Scanner;
//Declaramos la clase
public class PUNTO9 {
 
    public static void main(String[] args) {
        
        Scanner Leer =new Scanner(System.in);

 
        //Insertamos el DNI
       System.out.print("Escribe los numero de tu DNI = ");
        int dni=Leer.nextInt();
 
        //Sacamos el resto
        int res=dni%23;
 
        //Invocamos el metodo
        char letra=letraNIF(res);
 
        //Mostramos el DNI completo
        System.out.println("Tu DNI es " +dni + " " + letra );
 
    }
    public static char letraNIF(int res){
 
        //Definimos el array de char
        char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                          'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        //Devolvemos el valor en la posicion del array
        return letrasNIF[res];
    }
}
 
