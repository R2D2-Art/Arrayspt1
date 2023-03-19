/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto8;

import java.util.Scanner;
public class PUNTO8 {
    
    public static void main(String[] args) {
 
        //Indicamos el tamaño
         //Declaramos la variable Scanner y creamos el objeto del mismo
        //Entre parentesis especificamos que la entrada de datos es por consola
        Scanner Leer = new Scanner(System.in);
        
        //Indicamos el tamaño
        System.out.print("Introduce un tamaño = ");   
        int tamano =Leer.nextInt();
        //creamos la variable donde se indicara elespacio del tamaño con new
        int num[]=new int[tamano];
        // de claramos una variable
        int ultimoNumero;
        //creamos un bucle donde se introducira un numeros entre o y 9
        do{
            System.out.println("Introduce numero entre 0 y 9");
            ultimoNumero=Leer.nextInt();
            
            // while mientras se cumpla esta se continuara si no, se repitira hasta que se cumpla la condicion
        }while(!(ultimoNumero>=0 && ultimoNumero<=9));
 
        //rellenamos el array c
        numerosAleatorios(num);
 
        //Creamos un array que contenga los numeros terminados en el numero especificado
        int terminadosEn[]=numerosTerminados(num, ultimoNumero);
 
        //Mostramos el resultado con la funcion mostrar
    
        mostrar(terminadosEn);
 
    }
    
    //metodo donde se asignaran los numeros aletorios entre 1 y 150
    public static void numerosAleatorios(int lista[]){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros dados
            lista[i]=(int)(Math.random()*(1-150)+150);
        }
    }
    
    //metodo para los numeros temininados 
     public static int[] numerosTerminados (int num[], int ultimo_numero){
 
        //Array que almacenara los numeros terminados en el numero pedido
        int terminadosEn[]=new int[num.length];
 
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++){
 
            /*
             * Restamos el numero por el mismo numero sin unidades
             * Por ejemplo, 325-320=5
             */
            numeroFinal=num[i]-(num[i]/10*10);
 
            //Si el numero obtenido es el buscado, lo añadimos
            if (numeroFinal==ultimo_numero){
                terminadosEn[i]=num[i];
            }
        }
 
        return terminadosEn;
    }
    public static void mostrar(int lista[]){
        for(int i=0;i<lista.length;i++){
            //No incluimos las posiciones que tengan un 0
            if(lista[i]!=0){
                System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
            }
        }
    }
 

 
}

