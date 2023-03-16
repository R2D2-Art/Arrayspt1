/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1;
//Importamos la clase o paquete scanner
import java.util.Scanner;
//Declaramos la clase 
public class PUNTO1 {
 
    public static void main(String[] args) {
        
         //se crea la variable cantidad se crea un espacio en la memoria con new
        // seguido de int como tipo de entra de valor y entre corchetes el tamaño del array
        int cantidad[] = new int[5];
        
        //se llama las funciones las cuales son igual a la variable cantidad
        numeros (cantidad);  
        mostrar (cantidad);
        
      
    }      
    //Se crea un metodo llamdo numeros que entre parentesis una nueva variable tipo int que va a ser igual a la funcion 
    public static void numeros(int num[]){
        //Declaramos la variable Scanner y creamos el objeto del mismo
        //Entre parentesis especificamos que la entrada de datos es por consola
        Scanner Consola = new Scanner(System.in);
        
        //se crea un ciclo se inicializa con i=0 hasta i<cantidad de uno en uno si no se cumple la condicion se cierra el ciclo
        for(int i=0;i<num.length;i++){ 
            //creamos un system que mostrara el mensaje
            System.out.print("Introduce un número = ");
            //la variable num[i] es igual al valor del elemento que ingresamos por consola 
            num[i]=Consola.nextInt();  
        }   
    }
    //se crea aun segundo metodo llamado mostrar entre parentesis una nueva variable tipo int que va a ser igual a la funcion 
    public static void mostrar(int valor[]){
        
        //se crea un ciclo se inicializa con i=0 hasta i<indice de uno en uno si no se cumple la condicion se cierra el ciclo
        for(int i=0;i<valor.length;i++){
            //Se crea un system que imprimira el mesaje mas la variable i que sera el numero del indice mas el resto del mensaje junto a la variable valor[i] que tiene almacenados
            //los valores del anterior metodo en [i]
            System.out.println("En el indice " + i + " esta el valor = " + valor[i]);
        }
    }
     
}
    

