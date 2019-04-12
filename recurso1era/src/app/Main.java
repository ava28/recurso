package app;

import java.util.Scanner;

/**
 *
 * @author vega
 */
public class Main {

  
    
    
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        eje1 e1=new eje1();
        
        System.out.println("Ejercicio 2");
        eje2<Integer> ej2 = new eje2<>(Integer.class, 10);
         ej2.rellenarRandom(ej2.arreglo2);
         ej2.imprimir(ej2.arreglo2, 0);
         ej2.promedio(ej2.arreglo2);
         ej2.promRecursivo(ej2.arreglo2, 0);
        System.out.println("Ejercicio 3");
        eje3 ej=new eje3(); //terminado
        System.out.println("Ejercicio 4");
        eje4 s=new eje4();
        System.out.println("Ejercicio 5");
        Double []array = {1d,2d,3d,5d};
        recursividad r=new recursividad();
        r.imprimir(array,0);
        System.out.println("Los valores invertidos son: ");
        r.inverso(array,array.length-1);
        r.suma(array, 0);
        Double a=5d;
        System.out.println("suma de los valores es: "+r.suma(array,array.length-1));
        System.out.println("El valor Buscado se encuentra en la posicion "+r.buscar(array,a,array.length-1));
        System.out.println("suma de los valores es: "+r.multiplicacion(array,array.length-1));
        System.out.println("-------------------------");
        r.rangoHasta(5,0);
        r.rangoDesde(10,5);
        r.sumarhasta(5, 0, 0);
    }
    
}
