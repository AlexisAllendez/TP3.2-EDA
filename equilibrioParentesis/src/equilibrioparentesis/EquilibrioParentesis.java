package equilibrioparentesis;

import java.util.Stack;

public class EquilibrioParentesis {
    //ALMACENA LA CADENA A VERIFICAR
    private String cadena;

    public EquilibrioParentesis(String cadena) {
        this.cadena = cadena;
    }

    public boolean verificarEquilibrio() {
       //PILA QUE ALMACENA LOS PARENTESIS DE APERTURA
        Stack<Character> pila = new Stack<>();
        
       //BUCLE QUE ITERA SOBRE LA CADENA DE TEXTO BUSCANDO LOS PARENTESIS
       //UTILIZA EL TOCHARARRAY PARA CONVERTIR LA CADENA EN ARRAY SEPARANDOLA CARACTER POR CARACTER
        for (char caracter : cadena.toCharArray()) {
       // SI ENCUENTRA UNO DE APERTURA LO AGREGA A LA PILA
            if (caracter == '(' || caracter == '{' || caracter == '[' || caracter == '<') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']' || caracter == '>') {
       // SI ENCUENTRA UNO DE CIERRE AUTOMATICAMENTE VERIFICA SI HAY UNO DE APERTURA EN LA PILA
       // SI LA PILA ESTA VACIA SIGNIFICA QUE NO HAY UNA APERTURA CORRESPONDIENTE Y DEVUELVE FALSE
                if (pila.isEmpty()) {
                    System.out.println("La cadena no esta equilibrada");
                    return false; 
                }
                
               //SACAMOS EL ULTIMO PARENTESIS QUE SE ENCUENTRA EN LA PILA
                char caracterPila = pila.pop();
               //SE VERIFICA SI EL PARENTESIS DE CIERRE COINCIDE CON EL ULTIMO EXTRAIDO DE LA PILA
                if ((caracter == ')' && caracterPila != '(')
                        || (caracter == '}' && caracterPila != '{')
                        || (caracter == ']' && caracterPila != '[')
                        || (caracter == '>' && caracterPila != '<')) {
                    
                    System.out.println("La cadena no esta equilibrada.");
                    return false;
                }
            }

        }
        
        //SI LA PILA NO ESTA VACIA SIGNIFICA QUE HAY UN PARENTESIS QUE NO TIENE SU PAR CORRESPONDIENTE
        if (!pila.isEmpty()) {
            System.out.println("La cadena no esta equilibrada.");
            return false;
        }
        //SI LA PILA ESTA VACIA SIGNIFICA QUE TODOS LOS PARENTESIS TIENEN SU PAR CORRESPONDIENTE 
        //POR ENDE LA CADENA ESTA EQUILIBRADA
        System.out.println("La cadena esta equilibrada.");
        return true;
    }

   

    
    }


