package org.example.ArbolBinario;

public class Arbol {
    //nodo raiz del arbol
    private Nodo raiz;
    //constructor d la clase arbol
    public Arbol(){this.raiz=null;}
    //inserta un nodo con el valor del dato si el nodo esta vacio se crea un nodo

    public void insertar(int dato){
        if (this.raiz==null){
            this.raiz=new Nodo(dato);
        }else{
            this.insertar(this.raiz,dato);
        }
    }

    private void insertar (Nodo padre, int dato){
        if (dato< padre.valorNodo()){
            if (padre.GetSubarbolIzdo()==null){
                padre.SetRamaIzdo(new Nodo(dato));
            }else {
                insertar(padre.GetSubarbolIzdo(),dato);
            }
        }else if(dato>padre.valorNodo()){
            if (padre.GetSubarbolDcho()==null){
                padre.SetRamaDcho(new Nodo(dato));
            }else{
                insertar(padre.GetSubarbolDcho(),dato);
            }
        }

    }
}
