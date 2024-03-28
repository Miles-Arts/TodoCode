package Pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacía: " + pila);
        System.out.println("Está vacía: " + pila.isEmpty());

        //Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        //pila.push(5);

        //ForEach REcorrido
        for(Integer pilita : pila) {
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("¿Pila vacía? " + pila.isEmpty());

        pila.pop(); //Eliminar el último elemento de la Pila STACK
        System.out.println("¿Esta el 3? " + pila.search(3));
        System.out.println("Último agregado: " + pila.peek());
    }
}
