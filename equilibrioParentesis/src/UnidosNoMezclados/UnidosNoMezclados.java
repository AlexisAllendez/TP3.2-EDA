
//. Unidos no mezclados
//Se tienen 2 pilas con elementos ordenados de mayor a menor, se desea
//pasar todos los elementos a una tercera pila en la que los elementos sigan
//manteniendo el orden de mayor a menor.
package UnidosNoMezclados;

import java.util.Arrays;
import java.util.Stack;

import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

public class UnidosNoMezclados {
    private Integer[] pila1;
    private Integer[] pila2;
    private Integer[] pila3;
    private int size;
    private int cursor;

    public UnidosNoMezclados() {
    }

    
    
    
    public UnidosNoMezclados(int size) {
        this.pila1 = new Integer[size];
        this.pila2 = new Integer[size];
        this.pila3 = new Integer[size];
        this.size = size;
        this.cursor = -1;
    }

  
     public void push(Integer[]pila,int entero){
        if(!PilaLlena()){
            cursor++;
            pila[cursor] = entero;
//            pila.add(entero);
        }else{System.out.println("La pila esta llena y no se puede agregar mas elementos");}
    }
     
     
    public Integer pop(Integer[]pila){
        if(!pilaVacia(pila)){
            int retorno = verElemento(pila);
            pila[cursor] = null;
            cursor--;
//            pila.removeLast();
            return retorno;
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
        
//        return pila.get(pila.size()-1);
    }
    
    
    public boolean pilaVacia(Integer[]pila){

        return cursor < 0;
    }
    
    
    
    public boolean PilaLlena(){
        return cursor == size -1;
//        return pila.size() == this.size;

    }
    public Integer verElemento(Integer[]pila){
        if(!pilaVacia(pila)){
            System.out.println(pila[cursor]);
            return pila[cursor];
//            System.out.println(pila.getLast());
//              return pila.getLast();
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
    }
    

   
    public void llenarPilas(Integer[] pila) {
        // LLENADO DEL ARREGLO CON UN BUCLE FOR
        for (int i = 0; i < pila.length; i++) {
            pila[i] = (int) (Math.random() * 100) + 1;
        }
            System.out.println(Arrays.toString(pila));
    }

    

    
     public void ordenarPilas(Integer[]pila) {

        for (int i = 0; i < pila.length - 1; i++) {
            // Últimos i elementos ya están ordenados, así que no necesitamos compararlos
            for (int j = 0; j < pila.length - i - 1; j++) {
                // Comparamos el elemento actual con el siguiente
                if (pila[j] > pila[j + 1]) {
                    // Si el elemento actual es mayor que el siguiente, los intercambiamos
                    int temporal = pila[j];
                    pila[j] = pila[j + 1];
                    pila[j + 1] = temporal;
                }

            }

        }
        
        System.out.println(Arrays.toString(pila));

    }
    
    public Integer[] mostrarPila(Integer[]pila){
      
        return pila;
    }
    
    

    

    public void unirPilas(Integer[]pila1,Integer[]pila2,Integer[]pilaFinal){
            // EJECUTAMOS EL BUCLE HASTA QUE AMBAS PILAS ESTEN VACIAS
        while (!pilaVacia(pila1 )|| !pilaVacia(pila2)) {
            //COMPARAMOS AMBOS VALORES PARA LUEGO AGREGARLOS A LA PILA FINAL 
            if (verElemento(pila1) >= verElemento(pila2)) {
                int aux = pop(pila1);
                push(pilaFinal,aux);
            } else {
                int aux =pop(pila2);
                push(pilaFinal,aux);
            }

        }
        //LLAMAMOS AL METODO DE ORDENAMIENTO, ORDENAMOS PARA DESPUES IMPRIMIR LA PILA ORDENADA 
    //   ordenarPilas(pilaFinal);
        
         System.out.println(Arrays.toString(pilaFinal));
    }
}