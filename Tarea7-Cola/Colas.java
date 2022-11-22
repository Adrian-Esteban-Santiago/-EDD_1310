
package colas;
import java.util.ArrayList;


public class Colas<T> {

    private int tamanio;
    private ArrayList<T> auxiliar,dato;

    public Colas() {
         dato = new ArrayList<>();
        tamanio = -1;
    }
public boolean isEmpty(){
    return tamanio<=0;
}
public int length(){
    return dato.size();
} 

public void enqueue(T elementos){
    dato.add(elementos);
    tamanio++;
}  

public T dequeue(){
    if(tamanio==0){
        return null;
    }
    tamanio--;
    int i;
   for( i=dato.size();i!=0;i--)
   {
      
   }
        return dato.remove(i);
}

    
}
