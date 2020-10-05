

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefautMe {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Rodrigo");
		lista.add("Antonia");
		lista.add("Coisas");

		Comparator<String> comparador = new CompararPorTamanho();
		
		//Collections.sort(lista);
		System.out.println(lista);
		System.out.println("-------------");
		lista.sort(comparador);
		System.out.println(lista);
		
		for (String l : lista) {
			System.out.println(l);
		}
		
		System.out.println("-------------");
		
		Consumer<String> consumidor = new ImprimeL();
		lista.forEach(consumidor);

	}
}

class ImprimeL implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

class CompararPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;

		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}
