/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto7;


import java.util.Scanner;

public class PUNTO7 {
 
    public static void main(String[] args) {
 
        //Declaramos la variable Scanner y creamos el objeto del mismo
        //Entre parentesis especificamos que la entrada de datos es por consola
        Scanner Leer = new Scanner(System.in);
        
        //Indicamos el tamaño
        System.out.print("Introduce un tamaño = ");   
        int tamano =Leer.nextInt();
        
        //Creamos los arrys e indicamos el tamaño
        int array1[]=new int [tamano];
        int array2[];
 
        //llamamos al metodo numAleatorio
        numAleatorio(array1);
 
        //Apuntamos el array2 al array1
        array2=array1;
 
        //Creamos un nuevo array usando el array1. Array1 tendra una nueva direccion.
        array1=new int[tamano];
 
        // volvemos a llamr el metodo para rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores
        numAleatorio(array1);
 
        //Creamos otro array donde va a ser igual al metodo multiplicar
        int array3[]=multiplicar(array1, array2);
 
        //imprimismos todo los resultados indices y numeros aleatorios
 
        System.out.println("Array1");
        mostrarArray(array1);
 
        System.out.println("Array2");
        mostrarArray(array2);
 
        System.out.println("Array3");
        mostrarArray(array3);
 
    }
    
    //metodo para asignar numeros aleatorios dependiendo del tamaño
    public static void numAleatorio(int lista[]){
        
        //ciclo se define la conticion y el rango tanto del indice como el de los numeros aleatorios
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros dados y almacenamos en la variable lista[i]
            lista[i]=(int)(Math.random()*(10-100)+100);
        }
    }

    //metodo para imprimir los numeros aleatorios y el incdice
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }

    // metodo tipo int para multiplicar los array
    public static int[] multiplicar(int array1[], int array2[]){
        //se le da el tamaño al array3
        int array3[]=new int[array1.length];
        //ciclo donde se nultiplica los dos primeros arrays 
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        //se retorna la varible arrayy3
        return array3;
    }
}

