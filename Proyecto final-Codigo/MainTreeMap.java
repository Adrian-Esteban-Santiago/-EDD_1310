
package treemap;


public class MainTreeMap {
    public static void main(String[] args) {
       TreeMap arbol= new TreeMap();
        arbol.insertar(10);
        arbol.insertar(15);
        arbol.insertar(8);
        arbol.insertar(29);
        arbol.insertar(33);
        arbol.insertar(43);
        arbol.insertar(5);
        System.out.println(" ");
        arbol.inorden();
        System.out.println("INORDEN");
        System.out.println(" ");
        arbol.posorden();
        System.out.println("PREORDEN");
        System.out.println(" ");
        arbol.Preorden();
        System.out.println("POSTORDEN");
        System.out.println(" ");
        arbol.Preorden();
    }
}
