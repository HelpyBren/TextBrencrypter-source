import estructuras.Pila;

public class Encriptador {

	//primera versión funcional de encriptador :D
	
	//TODO: CAMBIAR EL MÉTODO AL AGREGAR LAS COLAS Y HASHMAPS PARA LA DESENCRIPCION!!!!!111111111111111
	public static String invPalabra(String palabra) {
		Pila stack =  new Pila();
		
		for (int i = 0; i < palabra.length() ; i++) {
			stack.push(palabra.charAt(i));
		}
		
		/*
		String invertida = "";
		while (!stack.estaVacia()) {
			invertida = invertida + stack.peek();
			stack.pop();
		}
		*/
		
		StringBuilder invertida = new StringBuilder();
	    while (!stack.estaVacia()) {
	        invertida.append(stack.pop());
	    }
		
		return invertida.toString();
	}
}
