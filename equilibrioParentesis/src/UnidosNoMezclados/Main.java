package UnidosNoMezclados;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Integer [] pila1 = new Integer [10];
        Integer [] pila2 = new Integer [10];
        Integer [] pila3 = new Integer [30];
        
        UnidosNoMezclados p1 = new UnidosNoMezclados();
        
        System.out.print("La pila 1 desordenada es : ");
        p1.llenarPilas(pila1);
        System.out.print("La pila 2 desordenada es : ");
        p1.llenarPilas(pila2);
   
        System.out.print("La pila 1 ordenada es : ");
        p1.ordenarPilas(pila1);
        System.out.print("La pila 2 ordenada es : ");
        p1.ordenarPilas(pila2);
        
    
        
        p1.unirPilas(pila1,pila2,pila3);

    }

}
