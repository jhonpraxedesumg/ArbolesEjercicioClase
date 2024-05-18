package org.example;


import org.example.ArbolBinario.Arbol;
import org.example.ArbolCadena.ArbolCadenas;

public class Main {
    public static void main(String[] args) {

//        Arbol arbol = new Arbol();
//        arbol.insertar(5);
//        arbol.insertar(6);
//        arbol.insertar(7);
//        arbol.insertar(2);
//        arbol.insertar(3);
//        arbol.insertar(8);
//        arbol.insertar(9);
//        arbol.insertar(1);
//        arbol.insertar(2);


        ArbolCadenas cadena = new ArbolCadenas();
        cadena.insertar("mercedes");
        cadena.insertar("volvo");
        cadena.insertar("volkswagen");
        cadena.insertar("fiat");
        cadena.insertar("bmw");
        cadena.insertar("audi");
        cadena.insertar("lamborgini");
        cadena.insertar("toyota");

    }
}