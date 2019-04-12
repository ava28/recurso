
package app;

import java.lang.reflect.Array;

/**
 *
 * @author vega
 */
public class recursividad  <T extends Comparable<T>>{
    
    public static Double[] devolver(Double []arreglo, int cont){
        if(cont<=arreglo.length-1){
            System.out.println("Dame un numero");
            arreglo[cont]=new java.util.Scanner(System.in).nextDouble();
            return devolver(arreglo, cont+1);
        }
        return arreglo;
    }
   public static <T> int buscar (T []array,T find,int length){
        
         if (length <0)
            return -1;
        if (array[length].equals(find))
            return length;
        return buscar (array,find,length-1);
    }
    
   public static <T> double suma (T []array,int length){
        
        if (length <0)
            return 0d;
        return   Double.parseDouble(" "+array[length])+ suma(array,length-1);
    }
     public static <T> double multiplicacion (T []array,int length){
        
        if (length <0)
            return 0d;
        return   Double.parseDouble(" "+array[length])* suma(array,length-1);
    } 
    
    public static <T> void imprimir (T []array,int length){    
        if (length !=array.length){
             System.out.print("a["+length+"]="+array[length]);
             
             imprimir(array,length+1);
        }  System.out.println("");
    } 
      public static <T > void inverso(T []array,int length){
        
        if (length >=0){
             System.out.println("a["+length+"]="+array[length]);
             inverso(array,length-1);
        }   
    }
      public static <T>  void rangoHasta(int rango, int indice){
        int []arreglo = new int[rango+1];
          if(indice==rango+1){    
        }
        else{
            arreglo[indice]=indice;
            System.out.println("RANGO Hasta: "+arreglo[indice]);
            rangoHasta(rango, indice+1);
        }
      }
      public static <T>  void rangoDesde(int rango, int Desde){
        int []arreglo = new int[rango+1];
          if(Desde==rango+1){    
        }
        else{
            arreglo[Desde]=Desde;
            System.out.println("Rango Desde: "+arreglo[Desde]);
            rangoDesde(rango, Desde+1);
        }
      }
      
}
