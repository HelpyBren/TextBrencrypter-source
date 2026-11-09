package estructuras;

public class Nodo {
    char dato;
    Nodo siguiente;

    public Nodo(char dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public char getDato() {
        return dato;
    }

	public void setDato(char dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "Nodo ["+dato +"]";
	}
    
    
}