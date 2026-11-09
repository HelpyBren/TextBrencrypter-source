package estructuras;

public class Pila {
    private Nodo tope; 

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(char valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;           
    }

    public char pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        char valor = tope.dato;
        tope = tope.siguiente; 
        return valor;
    }

    public char peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return tope.dato;
    }
}
