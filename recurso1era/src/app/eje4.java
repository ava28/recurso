
package app;

import static app.recursividad.imprimir;
import static app.recursividad.suma;



/**
 *
 * @author vega
 */
public class eje4 {
     eje4(){
     Double []array ={-2d,5d,8d,9d,-9d,10d,15d,-4d};
     Double suma=0d;
     Double spos=0d;
     Double sneg=0d;
     System.out.println("Iterativo"); 
     sumaiterativa(array, 0, spos, sneg);
         System.out.println("Recusivo");
     sumapos(array, 0, suma);
     sumaneg(array, 0, suma);
         
     }
     
     public static <T> void sumaiterativa(Double []arreglo, int indice, Double spos, Double sneg){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                spos += arreglo[i];
            } else {
                sneg += arreglo[i];
            }
        }
        System.out.println("La suma de los valores positivos es :" + spos);
        System.out.println("La suma de los valores negativos es :" + sneg);
    }
     
     
     public static <T> void sumapos(Double[]arreglo, int indice,Double suma){
         if(arreglo.length==indice){
             System.out.println("La suma de los valores positivos es "+suma);
         }
         else{
             if(arreglo[indice]>0){
                 suma+=arreglo[indice];
             }
             
             sumapos(arreglo, indice+1, suma);
         }
         
     }
     public static <T> void sumaneg(Double[]arreglo, int indice,Double suma){
         if(arreglo.length==indice){
             System.out.println("La suma de los valores negativos es "+suma);
         }
         else{
             if(arreglo[indice]<0){
                 suma+=arreglo[indice];
             }
             
             sumaneg(arreglo, indice+1, suma);
         }
    }
}
