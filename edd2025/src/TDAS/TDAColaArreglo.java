package TDAS;

import interfaces.Queue;
import excepciones.EmptyQueueException;

public class TDAColaArreglo<E> implements Queue<E> {
	
	protected E [] arr;
	protected int cant;
	
	public TDAColaArreglo(int cant) {
		arr = (E[]) new Object[cant];
		cant = 0;
	}
	public TDAColaArreglo() {
		this(50);
	}
	public int size() {
		return cant;
	}
	public boolean isEmpty() {
		return cant == 0;
	}
	public E front() {
		if (!isEmpty())
			return arr[cant-1];
		else
			throw new EmptyQueueException("La cola está vacía.");
	}
	public void enqueue(E elemento) {
		arr[cant] = elemento;
		cant++;
	}
	public E dequeue() {
		E elem = null;
			if (!isEmpty()) {
				elem = arr[cant-1];
				arr[cant-1] = null;
				cant--;
			}
			else
				throw new EmptyQueueException("La cola está vacía.");
		return elem;
	}

}
