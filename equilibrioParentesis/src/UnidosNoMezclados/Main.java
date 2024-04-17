package UnidosNoMezclados;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Stack<Integer> pilaFinal = new Stack<>();
        UnidosNoMezclados p1 = new UnidosNoMezclados();

        p1.llenarPilas(pila1);
        p1.llenarPilas(pila2);

        p1.ordenarPilas(pila1);
        p1.ordenarPilas(pila2);

    }

}
