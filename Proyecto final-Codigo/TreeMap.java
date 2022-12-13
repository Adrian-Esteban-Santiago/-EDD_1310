
package treemap;


public class TreeMap {

   Nodo principal;
    public TreeMap(){
        this.principal=null;
    }
    public void insertar(int valor){
        if(this.principal == null){
            this.principal=new Nodo(valor);
        }else{
            this.principal.insertr(valor);
        }
    }
    public void Preorden(){
        this.preorden(this.principal);
    }
    public void preorden(Nodo nodo){
        if(nodo == null){
            return;
        }else{
            System.out.print(nodo.getpuntuacion()+ ", ");
            preorden((nodo.getNodoIzquierdo()));
            preorden(nodo.getNodoDerecho());
        }
    }
    public void inorden(){
        this.inorden(this.principal);
    }
    public void inorden(Nodo nodo){
        if(nodo == null){
            return;
        }else{

            inorden((nodo.getNodoIzquierdo()));
            System.out.print(nodo.getpuntuacion()+ ", ");
            inorden(nodo.getNodoDerecho());
        }
    }
    public void posorden(){
        this.posorden(this.principal);
    }
    public void posorden(Nodo nodo){
        if(nodo == null){
            return;
        }else{

            posorden((nodo.getNodoIzquierdo()));
            posorden(nodo.getNodoDerecho());
            System.out.print(nodo.getpuntuacion()+ ", ");
        }
    }
    
}
