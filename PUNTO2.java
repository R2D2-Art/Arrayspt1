/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto2;
//Importamos la clase o paquete scanner
import java.util.Scanner;
//Declaramos la clase 
public class PUNTO2 {
 
    public static void main(String[] args) {
        //Declaramos la variable Scanner y creamos el objeto del mismo
        //Entre parentesis especificamos que la entrada de datos es por consola
        Scanner Leer = new Scanner(System.in);
        
        //Indicamos el tamaño
        System.out.print("Introduce un tamaño = ");
        
         
         //se crea la variable num se crea un espacio en la memoria con new
        // seguido de int como tipo de entra de valor y entre corchetes utilizamos el onjeto de Scanner para indicar el tamaño
        int num[]=new int[Leer.nextInt()];
        
        //Llmamos las vuncionesentre parentesis la variable num dando a entenr que es igual
        Aleatorio(num);
        mostrar(num);
    }
    
    //Se crea un metodo llamado Aleatorio que entre parentesis una nueva variable tipo int que va a ser igual a la funcion 
    public static void Aleatorio(int valor[]){
        
         //se crea un ciclo se inicializa con i=0 hasta i<valor de uno en uno si no se cumple la condicion se cierra el ciclo
        for(int i=0;i<valor.length;i++){
            
            // utilizamos la clase Math llamando al metodo ramdow le damos el rango para generar el rango entre 10 al 20 y 
            //se convierte en entero debido al(int)y se guarda en la variable valor [i]
            valor[i]=(int)(Math.random()*(20-10+1)+ 10 );
        }
    }

     //Se crea un metodo llamado Aleatorio que entre parentesis una nueva variable tipo int que va a ser igual a la funcion 
    public static void mostrar(int valor[]){
        
         //se crea un ciclo se inicializa con i=0 hasta i<valor de uno en uno si no se cumple la condicion se cierra el ciclo
        for(int i=0;i<valor.length;i++){
            
            //se crea un system en el que imprime el numero de indice al que pertenece cada uno de los valores que dio el metodo anterior de forma aleatoria
            System.out.println("En el indice "+i+" esta el valor "+valor[i]);
        }
    }
}

