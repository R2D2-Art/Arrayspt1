/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto3;
// se importa la clase que nos da una ventana
import javax.swing.JOptionPane;
  //declaramos la clase
public class PUNTO3 {
   
    public static void main(String[] args) {
   
        //se illama a un metodo que muestra una ventana para introducir el tamaño
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        
        //se crea una variable num da el espasio para almacenar el tamaño
        int num[]=new int[Integer.parseInt(texto)];
   
        //se llama a las funciones
        PrimosAleatorio(num);
        mostrar(num);
         
        //Saco el primo mayor
        int primoMayor=mayor(num);
        System.out.println("El primo más grande es el "+primoMayor);
    }
    //se crea un metodo
    public static void PrimosAleatorio(int lista[]){
   
        int i=0;
   
        //Usamos un while solo aumentara cuando genere un primo
        while(i<lista.length){  
            
            //llamamos con la clase math el metodo ramdom para decir el rango para que saque los numeros
            int num=(int)(Math.random()*(100-1)+1);
            //se hace una condicion 
            if (Primo(num)){              
                lista[i]=num;               
                i++;            
            }       
        }   
    }   
    //se crea un metodo  con boolean dondo indicamos que esprimo es igual al otro objeto primo
    private static boolean Primo (int num){       
          
        //Un numero negativo el 0 y el 1 son directamente no primos.
        if (num<=1){
            return false;
        }
        else{
  
            //declaramos variables       
            int prueba;         
            int contador=0;
            
            //Hacemos la raiz cuadrada con la funcion math.sqrt la cual saca la raiz cuadrada del numero
            prueba=(int)Math.sqrt(num);
            
            //Bucle que cuenta los numeros divisibles
            for (;prueba>1;prueba--){
                
                if (num%prueba==0){
                    contador+=1;
                }
            }
            
            return contador < 1;
        }
    }
    
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }
         
        return mayor;
    }
   
    public static void mostrar(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
     

     
}
