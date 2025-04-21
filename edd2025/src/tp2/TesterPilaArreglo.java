package tp2;

public class TesterPilaArreglo {

	public static void main(String[] args) {
		PilaArregloEj1<Integer> prueba = new PilaArregloEj1<Integer>();
		Integer [] arr = new Integer[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		prueba.invertir(arr);
	}
}
