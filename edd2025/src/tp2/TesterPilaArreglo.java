package tp2;

public class TesterPilaArreglo {

	public static void main(String[] args) {
		PilaArreglo<Integer> prueba = new PilaArreglo<Integer>();
		Integer [] arr = new Integer[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		prueba.invertir(arr);
	}
}
