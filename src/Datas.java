import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate antonia = LocalDate.of(2020, Month.OCTOBER, 5);

		Period period = Period.between(hoje, antonia);
		System.out.println(period.getDays());

		LocalDate plusYears = antonia.plusYears(6);
		System.out.println(plusYears);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = plusYears.format(formatador);

		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora.format(formatadorHoras));
	}
}
