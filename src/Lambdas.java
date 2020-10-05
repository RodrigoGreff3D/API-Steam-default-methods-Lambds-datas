

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("Rodrigo");
		lista.add("Antonia");
		lista.add("Coisas");
//op 1
//		lista.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//
//		});
//
		System.out.println(lista);
		System.out.println("-------");
//
//		// op1 1 lambda
//		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		System.out.println(lista);
//		System.out.println("-------");
//
//		lista.forEach(s -> System.out.println(s));
//		System.out.println("-------");

		// new Thread(() -> System.out.println("teste")).start();
		// System.out.println("-------");

		lista.sort(Comparator.comparing(s -> s.length()));//mesmo que o de baixo
		lista.sort(Comparator.comparing(String::length));//mesmo que o de cima
		System.out.println(lista);
		System.out.println("-------");

	}
}

//class CompararPorT implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length()) {
//			return -1;
//
//		}
//		if (s1.length() > s2.length()) {
//			return 1;
//		}
//		return 0;
//	}
//
//}
