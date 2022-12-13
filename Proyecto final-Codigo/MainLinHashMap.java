
package linkedhashmap;


public class MainLinHashMap {
    public static void main(String[] args) {
     LinkedHashMap equipo = new LinkedHashMap(5);
        equipo.add("Lider","Adrian" );
        equipo.add("Sub lider","Victor");
        equipo.add("Soporte","Pedrito");
        equipo.add("Soporte2","Barbara");
        System.out.println("Mi Lider es:" + equipo.valueOf("Lider") );
        System.out.println("Cambiare mi lider a:");
        equipo.add("Lider","Victor");
        System.out.println("Mi Lider es:" + equipo.valueOf("Lider") );
    }
}
