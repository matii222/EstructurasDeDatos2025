package tp2;

import java.util.Queue;
import java.util.LinkedList;
					
	public class ColaDeImpares {
		
		public static Queue<Integer> ColaImpares(Queue<Integer> cola) {
			Queue<Integer> colaconimpares = new LinkedList<Integer>();
			Integer aux = -1;
			while(cola.size() > 0) {
				aux = cola.poll();
					if (aux != null && aux%2 != 0)
						colaconimpares.add(aux);
			}
		return colaconimpares;
		}
		
		public static void main (String[] args) {
			Queue<Integer> prueba = new LinkedList<Integer>();
				for(int i = 0; i < 15; i++) {
					prueba.add(i);
				}
			System.out.println("Cola original: "+prueba);
			System.out.println("Nueva cola solo con los impares: "+ColaImpares(prueba));
		}
	}
