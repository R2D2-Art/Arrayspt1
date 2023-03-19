/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto10;
// importamos la clase  para el panel
import javax.swing.JOptionPane;
public class PUNTO10 {

 
 
    public static void main(String[] args) {
 
        //Tamaño del array
        final int TAMANIO=10;
 
        //Creamos los arrays
        String nombres[]=new String[TAMANIO];
        double notas[]=new double[TAMANIO];
 
        //Rellenamos el array de una vez
        nombresNotas(notas, nombres);
 
        //Devuelve las notas con palabras
        String resultado[]=Resultado(notas);
 
        //Mostramos el resultado
        mostrar(nombres, notas, resultado);
 
    }
 
    public static void nombresNotas (double notas[], String nombres[]){
        for(int i=0;i<notas.length;i++){
            //Introducimos los valores de una vez
            nombres[i]=JOptionPane.showInputDialog("Introduce el nombre del alumno "+(i+1));
 
            double nota;
            //declaramos variable 
            
            do{
                String texto=JOptionPane.showInputDialog("Introduce una nota del alumno "+(i+1));
                nota=Double.parseDouble(texto);

            }while(nota<=0 || nota>=10);
            notas[i]=nota;
        }
    }
 
    public static void mostrar(String nombres[], double notas[], String resultado[]){
        for(int i=0;i<nombres.length;i++){
            System.out.println("El alumno "+nombres[i]+" tiene una nota de "+notas[i]+", por lo que su resultado es "+resultado[i]);
        }
    }
 
    public static String[] Resultado(double notas[]){
        
        //creamos una varible donde se le alamcenara las notas
        String resultado[]=new String[notas.length];
        
        
        for(int i=0;i<notas.length;i++){
            //condicional con switch ddonde se reliza por casos y decimo sque se le agigna dependiendo del resultado
            switch((int)notas[i]){
                case 1:
                case 2:
                case 3:
                case 4:
                    resultado[i]="Suspenso";
                    break;
                case 5:
                case 6:
                    resultado[i]="Bien";
                    break;
                case 7:
                case 8:
                    resultado[i]="Notable";
                    break;
                case 9:
                case 10:
                    resultado[i]="Sobresaliente";
                    break;
            }
        }
        //retornamos resultado 
        return resultado;
    }
}

