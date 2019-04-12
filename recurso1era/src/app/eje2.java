/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import static app.recursividad.*;

import static app.recursividad.imprimir;
import java.lang.reflect.Array;
import java.util.Random;

/**
 *
 * @author vega
 */
public class eje2 <T>{
    T [] arreglo2;
     double cPares=0,aPares=0,cImpares=0, aImpares=0,sPares=0,sImpares=0;
     double sPares2=0,sImpares2=0;
             
    public eje2(Class clase, int taman) {
        arreglo2=(T[])Array.newInstance(clase, 10);
    }
    public void rellenarRandom(Integer [] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(10);
        }
    
    }
    public Double [] promedio (Integer [] arr){
            
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
               cPares=cPares+1;
                aPares+=arr[i];
            }else {
                cImpares=cImpares+1;
                aImpares+=arr[i];
            } 
            if (i%2==0) {
              sPares+=arr[i];
                
            }else{
                sImpares+=arr[i];
            }

        }
            System.out.println("Iterativo");
            Double [] prom = new Double [4];
            prom[0]=aPares/cPares;
            System.out.println("El promedio de los numeros pares es: "+ prom[0]);
            prom[1]=aImpares/cImpares;
            System.out.println("El promedio de los numeros impares es: "+ prom[1]);
            prom[2]=sPares;
            System.out.println("La suma de los elementos que ocupan las posiciones pares del arreglo es: " +prom[2]);
            prom[3]=sImpares;
            System.out.println("La suma de los elementos que ocupan las posiciones impares del arreglo es: " +prom[3]);
        return prom;
        
    }
    
    public Double [] promRecursivo(Integer[] arr, int reco){
     Double [] prom2 = new Double [4];
        if (reco<arr.length) {
            if (arr[reco]%2==0) {
                aPares+=arr[reco];
                cPares++;
            }else{
            aImpares+=arr[reco];
            cImpares++;
            }
            if (reco%2==0) {
                sPares2+=arr[reco];
            }else{
            sImpares2+=arr[reco];
            }
         
        }   else{
    
            System.out.println("RECURSIVO");
            prom2[0]=aPares/cPares;
            System.out.println("El promedio de los numeros pares es: "+ prom2[0]);
            prom2[1]=aImpares/cImpares;
            System.out.println("El promedio de los numeros impares es: "+ prom2[1]);
            prom2[2]=sPares2;
            System.out.println("La suma de los elementos que ocupan las posiciones pares del arreglo es: " +prom2[2]);
            prom2[3]=sImpares2;
            System.out.println("La suma de los elementos que ocupan las posiciones impares del arreglo es: " +prom2[3]);
             return prom2; 
        }    
            promRecursivo(arr, reco = reco +1);
          return null;
    }
    public static  <T> void imprimir(T[]arreglo2, int indice){
    if (indice !=arreglo2.length){
             System.out.println(arreglo2[indice]);
             imprimir(arreglo2,indice+1);
        }      
    }
    
}
