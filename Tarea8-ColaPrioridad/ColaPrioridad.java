
package colaprioridad;

import java.util.ArrayList;
public class ColaPrioridad <T> {
    private ArrayList<T>[] Colabounded;
    private int tamanio, size;

    public ColaPrioridad(int size) {
        Colabounded = new ArrayList[size];
        this.size = size;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return tamanio== 0;
    }

    public int length() {
        return tamanio;
    }
      public void enqueue(int niveles, T elem) {
        if(Colabounded[niveles] == null) {
            Colabounded[niveles] = new ArrayList<T>();
        }
        Colabounded[niveles].add(elem);
        tamanio++;
    }
       public T dequeue() {
        if(isEmpty())
        {
            return null;
        }

        for(int i = 0; i < size; i++) 
        {
            if(Colabounded[i] != null && !Colabounded[i].isEmpty()) 
            {
                tamanio--;
                return Colabounded[i].remove(i-1);
            }
        }

        return null;
    }
}
