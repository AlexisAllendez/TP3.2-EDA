
package equilibrioparentesis;

public class Main {

    public static void main(String[] args) {
    String cadena = "{[(a+b)*c]-(d+e)}";
        EquilibrioParentesis verificador = new EquilibrioParentesis(cadena);
        verificador.verificarEquilibrio();
    }
}


