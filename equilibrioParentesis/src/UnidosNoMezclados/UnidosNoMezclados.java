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
            pila.push((int) (Math.random() * 100)+1);

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
       

    }

    public Stack mostrarPila(Stack<Integer> pila){
      
        return pila;
    }
    
    public boolean pilaVacia(Stack<Integer> pila) {
//        return pila.isEmpty();
        boolean bandera = false;
        if (pila.size() == 0) {
            bandera = true;
        }
        return bandera;
    }
    

    public Integer verUltimo(Stack<Integer> pila) {
        if (!pilaVacia(pila)) {
            int ultimoElementoIndex = pila.size() - 1;
            return  pila.get(ultimoElementoIndex);
        } else {
            System.out.println("La pila esta vacia, no hay ultimo elemento");
            return null;
        }
    }
    
    

    public void unirPilas(Stack<Integer> pila1,Stack<Integer>pila2,Stack<Integer>pilaFinal){
            // EJECUTAMOS EL BUCLE HASTA QUE AMBAS PILAS ESTEN VACIAS
        while (!pilaVacia(pila1) && !pilaVacia(pila2)) {
            //COMPARAMOS AMBOS VALORES PARA LUEGO AGREGARLOS A LA PILA FINAL 
            if (verUltimo(pila1) >= verUltimo(pila2)) {
                pilaFinal.push(pila1.pop());
            }else{
                pilaFinal.push(pila2.pop());
            }

        }
        //LLAMAMOS AL METODO DE ORDENAMIENTO, ORDENAMOS PARA DESPUES IMPRIMIR LA PILA ORDENADA 
       ordenarPilas(pilaFinal);
        
        System.out.println("La pila resultante es : " + pilaFinal );
    }

}
