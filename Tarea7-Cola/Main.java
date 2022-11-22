
package colas;


public class Main {
   
   public static void main(String[] args) {
       Colas <Integer> colap = new Colas<Integer>();
   
        System.out.println("Esta vacia?");
        System.out.println(colap.isEmpty());
      
        System.out.println("Agregar 10 al final");
        colap.enqueue(10);
        System.out.println("Agregar 7 al final");
        colap.enqueue(7);
         System.out.println("Agregar 2 al final");
        colap.enqueue(2);
          System.out.println("Agregar 8 al final");
        colap.enqueue(8);
  
     
        System.out.println("El tamanio de la cola es: "+colap.length());
       
        System.out.println("Sacar el elemento de enfrente");
        colap.dequeue();
       
       
         System.out.println("El tamanio de la cola es: "+colap.length());
         
         System.out.println("Sacar el elemento de enfrente");
        colap.dequeue();
         System.out.println("El tamanio de la cola es: "+colap.length());
    }
    } 
    

