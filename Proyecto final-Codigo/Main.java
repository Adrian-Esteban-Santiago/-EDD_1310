
package hashmap;


public class Main {
     public static void main(String[] args) {
         HashMap lugar = new HashMap(4);
        lugar.add("Lugar","3" );
        lugar.add("SubLugar","X4");
        System.out.println("Mi lugar es:" + lugar.valueOf("Lugar") );
        System.out.println("Cambiare mi lugar");
        lugar.add("Lugar","1");
        System.out.println("Mi lugar es:" + lugar.valueOf("Lugar") );
    }
}
