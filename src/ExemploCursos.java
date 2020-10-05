
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C#", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		System.out.println("Maior que 100");
		cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos())
				.forEach(total -> System.out.println(total));
		System.out.println("--------------");

		System.out.println("Somando os maiores que 100");
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100)// pega os alunos que tem mais que 100
				.mapToInt(Curso::getAlunos).sum();// soma os alunos que tem mais que 100

		System.out.println(sum);
		System.out.println("--------------");

		cursos.stream() // optional nos ajuda a trabalhar com null ex: if == null
				.filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		System.out.println("--------------");

		System.out.println("Guardando em uma coleção");
		cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

		cursos.stream().forEach(c -> System.out.println(c.getNome()));
		System.out.println("--------------");

		System.out.println("Map");
		cursos.stream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

	}
}
