/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntoadt;


public class Main {
    
    ConjuntoADT<Integer> conjuntoADT1;
    ConjuntoADT<Integer> conjuntoADT2;

    public Main() {
        this.conjuntoADT2 = new ConjuntoADT();
        this.conjuntoADT1 = new ConjuntoADT();
    

System.out.println("\nAgrega lo elementos");
    conjuntoADT1.agregar(0);
    conjuntoADT1.agregar(1);
    conjuntoADT1.agregar(2);
    conjuntoADT1.agregar(3);
    conjuntoADT1.agregar(4);
    conjuntoADT2.agregar(3);
    conjuntoADT2.agregar(4);
    conjuntoADT2.agregar(6);
    System.out.println("conjuntoADT_1: " + conjuntoADT1);
    System.out.println("conjuntoADT_2: " + conjuntoADT2);

    
    
  System.out.println("\nTamanios");
    System.out.println("longitud conjuntoADT_1: " + conjuntoADT1.longitud());
    System.out.println("longitud conjuntoADT_2: " + conjuntoADT2.longitud());
    
    
    System.out.println("\nContiene");
    System.out.println("conjuntoADT_1 contiene 0: " + conjuntoADT1.contiene(0));
    System.out.println("conjuntoADT_1 contiene 5: " + conjuntoADT1.contiene(5));
    
    
    System.out.println("\nElimina 0 de conjuntoADT_1");
    conjuntoADT1.eliminar(0);
    System.out.println(conjuntoADT1);

    
    System.out.println("\nIgualdad");
    System.out.println("conjuntoADT_1 == conjuntoADT_2: " + conjuntoADT1.igual(conjuntoADT2));

    
    
    
    System.out.println("\nSubconjunto");
    System.out.println(conjuntoADT1.Subconjunto(conjuntoADT2) + "conjuntoADT_1 subconjunto conjuntoADT_2: ");
    
    
    

    /*
     * Union
     */
    System.out.println("\nUnion");
    conjuntoADT1.union(conjuntoADT2);
    System.out.println(conjuntoADT1);

    /*
     * Interseccion
     */
    System.out.println("\nInterseccion");
    ConjuntoADT<Integer> conjuntoADT_interseccion = conjuntoADT1.interseccion(conjuntoADT2);
    System.out.println("interseccion conjuntoADT_1 conjuntoADT_2: " + conjuntoADT_interseccion);

    /*
     * Diferencia
     */
    System.out.println("\nDiferencia");
    ConjuntoADT<Integer> conjuntoADT_diferencia = conjuntoADT1.diferencia(conjuntoADT2);
    System.out.println("diferencia conjuntoADT_1 conjuntoADT_2: " + conjuntoADT_diferencia);

    System.out.println("\nIterador");
    for (Integer elemento : conjuntoADT1) {
        System.out.println("elemento: " + elemento);
    }
    }
}
