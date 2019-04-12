/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import static app.recursividad.*;

/**
 *
 * @author vega
 */
public class eje3 {
    int t;
    Double b;
    Double []arreglo;
    int cont=0;
    int posicion = 0;
    public eje3(){
        int t;
        System.out.println("Digte el tamaño del arreglo");
        t=new java.util.Scanner(System.in).nextInt();
        Double []arreglo= new Double[t];
        devolver(arreglo, 0);
        imprimir(arreglo, 0);
        System.out.println("teclee el valor que desea buscar");
        b=new java.util.Scanner(System.in).nextDouble();
        buscariterativo(arreglo, b, t, cont);
        buscariterativo(arreglo, b, t, cont);
        
    }
    
    public static <T>void imprimir(T[]arreglo, int indice){
        if(indice==arreglo.length){
            System.out.println("");
        }else{
            System.out.println(arreglo[indice]);
            imprimir(arreglo, indice+1);
            }
    }
   
   public static <T> void buscariterativo (T []array,T b,int t, int cont){
        
        for (int i = 0; i < t; i++) {
           if(array[i].equals(b)){
            cont++;   
           }
       }if(cont==0){
            System.out.println("elemento encontrado no encontrado");
        }else{
            System.out.println("elemento encontrado y se repite "+cont+" veces");
        }
}
   public <T> void  buscarRecursivo(T[] array, int i, T b) {
        if (i < array.length) {
            if (array[i].equals(b)) {
                posicion = i;
                cont++;
                System.out.println("Existe el elemento en la posicion" + i);

            }
            buscarRecursivo(array, i+1, b);
        }else{
            if (cont == 0) {
                System.out.println("El elemento  '" + b + "'  No esta dentro del arreglo");
            } else {
                System.out.println("Se repite '" + cont + "'veces");
            }
        }
    }
}


