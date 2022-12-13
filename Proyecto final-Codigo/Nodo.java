
package treemap;


public class Nodo {
    Nodo nodoIzquierdo, nodoDerecho;
    int puntuacion;

    Persona persona;

    public Nodo(int puntuacion){
        this.puntuacion = puntuacion;
    }
    public int getpuntuacion(){
        return this.puntuacion;
    }
    public Nodo getNodoIzquierdo(){
        return this.nodoIzquierdo;
    }
    public Nodo getNodoDerecho(){
        return this.nodoDerecho;
    }
    public void insertr(int _putuacion){
        if(_putuacion < this.puntuacion){
            if (this.nodoIzquierdo == null) {
                this.nodoIzquierdo = new Nodo(_putuacion);
            }else{
                this.nodoIzquierdo.insertr(_putuacion);
            }
        }else{
            if(this.nodoDerecho == null){
                this.nodoDerecho = new Nodo(_putuacion);
            }else{
                this.nodoDerecho.insertr(_putuacion);
            }

        }
    }
}
