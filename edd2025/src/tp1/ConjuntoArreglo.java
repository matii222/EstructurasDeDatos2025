package tp1;

public class ConjuntoArreglo<E> implements Conjunto<E> {

	protected int cant;
	protected E [] arr;
	
	public ConjuntoArreglo(int cant) {
		arr = (E[]) new Object[cant];
		cant = 0;		
	}
	public int size() {
		return cant;
	}
	public int capacity() {
		return arr.length;
	}
	public boolean isEmpty() {
		return cant == 0;
	}
	public E get(int i) {
		return arr[i];
	}
	public void put(E elem) {
		arr[cant] = elem;
	}
	public boolean pertenece(E elem) {
		boolean esta = false;
			for (int i = 0; i < arr.length && !esta; i++) {
				esta = arr[i] == elem;
			}
		return esta;
	}
	public Conjunto<E> interseccion(Conjunto<E> c) {
		Conjunto<E> conj = null;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == c.get(i) && conj.get(i) != null && arr[i] != null)
					conj.put(arr[i]);
			}
		return conj;
	}
}