package tp2;

import interfaces.Stack;
import excepciones.EmptyStackException;

public class PilaArregloEj1<E> implements Stack<E> {

	protected E [] arr;
	protected int cant;
	
	public PilaArregloEj1(int cant) {
		arr = (E[]) new Object[cant];
		cant = 0;
	}
	public PilaArregloEj1() {
		this(50);
	}
	public int size() {
		return cant;
	}
	public boolean isEmpty() {
		return cant == 0;
	}
	public E top() {
		if (!isEmpty())
			return arr[cant-1];
		else
			throw new EmptyStackException("La pila está vacía.");
	}
	public void push(E elemento) {
			arr[cant] = elemento;
			cant++;
	}
	public E pop() {
		E elemento = null;
			if (!isEmpty())	{			
				elemento = arr[cant-1];
				arr[cant-1] = null;
				cant--;
			}
			else
				throw new EmptyStackException("La pila está vacía.");
		return elemento;				
	}
	
	public void invertir(E[] P) {
		PilaArregloEj1<E> pila = new PilaArregloEj1<E>();
		E aux = null;
			for(int i = 0; i < P.length; i++) {
				aux = P[i];
				pila.push(aux);
				System.out.print(aux+"-");
			}	
				System.out.println();
			for(int i = 0; i < P.length && !pila.isEmpty(); i++) {
				aux = pila.pop();
				P[i] = aux;
				System.out.print(aux+"-");				
			}
	}
}
