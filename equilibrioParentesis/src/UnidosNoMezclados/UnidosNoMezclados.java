//. Unidos no mezclados
//Se tienen 2 pilas con elementos ordenados de mayor a menor, se desea
//pasar todos los elementos a una tercera pila en la que los elementos sigan
//manteniendo el orden de mayor a menor.
package UnidosNoMezclados;

import java.util.Arrays;
import java.util.Stack;

public class UnidosNoMezclados {

    private Integer[] pila;
    private int size;
    private int cursor;

    public UnidosNoMezclados() {
    }

    
    
    public UnidosNoMezclados(Integer[] pila, int size, int cursor) {
        this.pila = pila;
        this.size = size;
        this.cursor = cursor;
    }


    
public void push(Integer[] pila, int entero) {
    boolean added = false; // Variable para controlar si se ha agregado el elemento

    // Recorrer el arreglo de la pila
    for (int i = 0; i < pila.length; i++) {
        // Verificar si la posición actual es nula
        if (pila[i] == null) {
            pila[i] = entero; // Agregar el elemento en la posición actual
            added = true; // Marcar que se ha agregado el elemento
            break; // Salir del bucle una vez que se haya agregado el elemento
        }
    }

    // Verificar si no se pudo agregar el elemento (la pila está llena)
    if (!added) {
        System.out.println("La pila está llena y no se pueden agregar más elementos.");
    }
}
    
      public Integer pop(Integer[] pila) {
        int lastIndex = ultimoIndiceValido(pila);
        if (lastIndex >= 0) {
            int retorno = pila[lastIndex];
            pila[lastIndex] = null;
            return retorno;
        } else {
            System.out.println("La pila está vacía y no se pueden quitar más elementos.");
            return null;
        }
    }
    
   public static boolean pilaVacia(Integer[] pila) {
        return pila == null || pila.length == 0;
    }
   
   private int ultimoIndiceValido(Integer[] pila) {
        for (int i = pila.length - 1; i >= 0; i--) {
            if (pila[i] != null) {
                return i;
            }
        }
        return -1;
    }
    
    
    
    public boolean PilaLlena(){
        return cursor == size -1;
//        return pila.size() == this.size;

    }
     public int verUltimo(Integer[] pila) {
        // Verificamos si la pila está vacía
        if (pilaVacia(pila)) {
            return -1; // Retorna -1 si la pila está vacía
        }

        // Encontramos el último índice válido
        for (int i = pila.length - 1; i >= 0; i--) {
            if (pila[i] != null) {
                return i;
            }
        }

        // Si no se encuentra ningún elemento válido, retorna -1
        return -1;
    }

    public void llenarPilas(Integer[] pila) {

        for (int i = 0; i < pila.length; i++) {
            pila[i] = (int) (Math.random() * 50 + 1);
        }

    }

    public void mostrarPila(Integer[] pila) {
        if (!pilaVacia(pila)) {
            System.out.print("[");
            for (int i = 0; i < pila.length; i++) {
                System.out.print(pila[i]);
                if (i < pila.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public void bubbleSort(Integer[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

public void unirPilas(Integer[] pila1, Integer[] pila2, Integer[] pilaFinal) {
    // Inicializamos los índices para cada pila
    int indexPila1 = verUltimo(pila1);
    int indexPila2 = verUltimo(pila2);
    int indexPilaFinal = 0;

    // Verificamos si las pilas no están vacías
    while (indexPila1 >= 0 && indexPila2 >= 0) {
        // Comparamos los elementos en la parte superior de ambas pilas
        if (pila1[indexPila1] >= pila2[indexPila2]) {
            // Agregamos el elemento de pila1 a pilaFinal
            pilaFinal[indexPilaFinal++] = pila1[indexPila1--]; 
        } else {
            // Agregamos el elemento de pila2 a pilaFinal
            pilaFinal[indexPilaFinal++] = pila2[indexPila2--]; 
        }
    }

    // Agregamos los elementos restantes de pila1 a pilaFinal (si hay alguno)
    while (indexPila1 >= 0) {
        pilaFinal[indexPilaFinal++] = pila1[indexPila1--];
    }

    // Agregamos los elementos restantes de pila2 a pilaFinal (si hay alguno)
    while (indexPila2 >= 0) {
        pilaFinal[indexPilaFinal++] = pila2[indexPila2--];
    }
        
    //ordenamos
        bubbleSort(pilaFinal);
        
    // Mostramos la pila final
    System.out.println("La pila resultante es : " + Arrays.toString(pilaFinal));
}
}