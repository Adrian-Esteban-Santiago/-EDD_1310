
package colaprioridad;


public class Main {
    
    public static void main(String[] args) {
       ColaPrioridad<String> colaLimi = new ColaPrioridad<String>(7);
        colaLimi.enqueue(4, "Maestro");
        
        colaLimi.enqueue(2, "Niños");
        
      
        colaLimi.enqueue(5, "Capitan");
        
        colaLimi.enqueue(4, "Timonel");
        
        colaLimi.enqueue(3, "Mujeres");
        
        colaLimi.enqueue(2, "3ra edad");
        
        colaLimi.enqueue(4, "Mecanico");
        
        colaLimi.enqueue(3, "Hombres");
        
        colaLimi.enqueue(4, "Vigia");
        
        colaLimi.enqueue(1, "Niñas");
      
    }
    }

