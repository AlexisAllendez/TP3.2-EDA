//. Unidos no mezclados
//Se tienen 2 pilas con elementos ordenados de mayor a menor, se desea
//pasar todos los elementos a una tercera pila en la que los elementos sigan
//manteniendo el orden de mayor a menor.
package UnidosNoMezclados;

import java.util.Stack;

public class UnidosNoMezclados {

    Stack<Integer> pila1 = new Stack<>();
    Stack<Integer> pila2 = new Stack<>();
    Stack<Integer> pilaFinal = new Stack<>();

    public UnidosNoMezclados() {

    }

    public void llenarPilas(Stack<Integer> pila) {
        //LLENADO DE PILAS
        for (int i = 0; i <= 20; i++) {
            pila.push((int) (Math.random() * 15));

        }

        System.out.println(pila);

    }

    public void ordenarPilas(Stack<Integer> pila) {
        int tamano = pila.size();

        for (int i = 0; i < tamano - 1; i++) {
            // Últimos i elementos ya están ordenados, así que no necesitamos compararlos
            for (int j = 0; j < tamano - i - 1; j++) {
                // Comparamos el elemento actual con el siguiente
                if (pila.get(j) > pila.get(j + 1)) {
                    // Si el elemento actual es mayor que el siguiente, los intercambiamos
                    int temporal = pila.get(j);
                    pila.set(j, pila.get(j + 1));
                    pila.set(j + 1, temporal);
                }

            }

        }
        System.out.println("Pila ordenada" + pila);

    }

    public boolean pilaVacia(Stack<Integer> pila) {
//        return pila.isEmpty();
        boolean bandera = false;
        if (pila.size() == 0) {
            bandera = true;
        }
        return bandera;
    }

    public void unirPilas(Stack<Integer> pila1,Stack<Integer>pila2,Stack<Integer>pilaFinal){
    
        while(!pilaVacia(pila1) && !pilaVacia(pila2)){
        
    
        }
        
    }

}
