/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto4;


public class PUNTO4 {

  
     
    public static void main(String[] args) {
        //Declaramos las variables que vamos a utilizar
        int sumar = 0;
        int media;
        //Declaramos la variable posiciones le damos espacio en la memoria con new 
        //y entre parentesis le damos las posiciones o el tamaño designado
        int posiciones[]= new int [20];
        
       //creamos un ciclo  lo inicializamos y el damos la limitacion con el valor de la virable posiciones gracias a length se toma automaticamente
        for(int i=0;i<posiciones.length;i++){
            //decimos que la variable posiciones[i] va a ser igual a los valores de i y a esta se le aumentara un mas uno cada vez hasta que se corte el ciclo
            posiciones[i]=i+1;
            //se hace la operacion de que suma va sumar y va a ser igual a posiciones [] por lo cual aumenara cadavez que se repita el ciclo
            sumar+=posiciones[i];
        }
        //imprime el mensaje mas el total de la suma anterior
        System.out.println("La suma es = " + sumar);
        
        //Se hace la operacion para la media el valor de la suma guardado en la variable se dividira en la cantidad de posiciones que halla
        media=sumar/posiciones.length;
        
        //Se imprime el mensaje mas el total almacenado de la operacion en la variable media
        System.out.println("La media es = " +  media);           
    }
}
