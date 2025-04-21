package TDAS;

import excepciones.EmptyStackException;
import interfaces.Stack;

public class TDAPilaArreglo<E> implements Stack<E> {

	protected E [] arr;
	protected int cant;
	
	public TDAPilaArreglo(int cant) {
		arr = (E[]) new Object[cant];
		cant = 0;
	}
	public TDAPilaArreglo() {
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
	} //AAAAAAAAAAAA
}
	
