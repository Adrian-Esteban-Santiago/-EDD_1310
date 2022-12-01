
package tablahash;


public class Main {
     public static void main(String[] args) {
          TablaHash<Integer, String> tabla = new TablaHash<>(2);
        tabla.add(1, "Adrian");
        tabla.add(2,"Esteban");
        
        System.out.println(tabla.valueOf(1));
         System.out.println(tabla.valueOf(2));
         
         tabla.remove(2);
         System.out.println("-----------");
          System.out.println(tabla.valueOf(1));
         System.out.println(tabla.valueOf(2));
         
         
    }
}