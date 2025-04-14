package tp2;

import java.util.Stack;

public class PilasIntercaladas {

	public static Stack<Integer> intercalar(Stack<Integer> p1, Stack<Integer> p2) {
		Stack<Integer> nuevapila = new Stack<Integer>();
		int aux1 = -100;
		int aux2 = -100;
			while(!p1.isEmpty() || !p2.isEmpty()) {
				if(!p1.isEmpty()) {
					aux1 = p1.pop();
					nuevapila.push(aux1);
				}
				if(!p2.isEmpty()) {
					aux2 = p2.pop();
					nuevapila.push(aux2);
				}
			}
		return nuevapila;
	}
	
	public static void main(String [] args) {
		Stack<Integer> piladeprueba1 = new Stack<Integer>();
		Stack<Integer> piladeprueba2 = new Stack<Integer>();
			for(int i = 0; i < 10; i++) {
				piladeprueba1.push(i*2);
			}
		piladeprueba2.push(3);
		piladeprueba2.push(8);
		piladeprueba2.push(7);
		piladeprueba2.push(5);
		piladeprueba2.push(2);
		
		System.out.println("Pila de prueba 1: "+piladeprueba1);
		System.out.println("Pila de prueba 2: "+piladeprueba2);
		System.out.println("Pilas intercaladas: "+intercalar(piladeprueba1, piladeprueba2));
	}
}
