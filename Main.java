
package pilas;


public class Main {
     public static void main(String[] args) {
         Pilas<Integer> datos = new Pilas<Integer>();
        System.out.println("Stack using Array");
        System.out.println("isEmpty(): " + datos.isEmpty());
        System.out.println("length(): " + datos.length());
        System.out.println("push(1)");
        datos.push(1);
        System.out.println("push(2)");
        datos.push(2);
        System.out.println("push(3)");
        datos.push(3);
        System.out.println("peek(): " + datos.peek());
        System.out.println("pop(): " + datos.pop());
        System.out.println(datos);
    }
    }
     
   

