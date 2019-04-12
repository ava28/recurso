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
public class eje1 {
    int t;
    Double b;
    Double []arreglo;
    public eje1(){
        int t;
        System.out.println("Digte el tamaño del arreglo");
        t=new java.util.Scanner(System.in).nextInt();
        Double []arreglo= new Double[t];
        devolver(arreglo, 0);
        System.out.println("Revursivo");
        imprimir(arreglo, 0);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Dame un numero");
            arreglo[i]=new java.util.Scanner(System.in).nextDouble();
           
        }
        System.out.println("Iterativo");
        imprimir(arreglo, 0);
    }
    
}
