package org.example.ArbolCadena;


public class ArbolCadenas {
    //nodo raiz del arbol
    private NodoCadena raiz;
    //constructor d la clase arbol
    public ArbolCadenas(){this.raiz=null;}
    //inserta un nodo con el valor del dato si el nodo esta vacio se crea un nodo

    public void insertar(String dato){
        if (this.raiz==null){
            this.raiz=new NodoCadena(dato);
        }else{
            this.insertar(this.raiz,dato);
        }
    }

    private void insertar (NodoCadena padre, String dato){
        if (dato.compareTo(dato)>0 ){
            if (padre.GetSubarbolIzdo()==null){
                padre.SetRamaIzdo(new NodoCadena(dato));
            }else {
                insertar(padre.GetSubarbolIzdo(),dato);
            }
        }else {
            if (padre.GetSubarbolDcho()==null){
                padre.SetRamaDcho(new NodoCadena(dato));
            }else{
                this.insertar(padre.GetSubarbolDcho(),dato);
            }
        }

    }
}
