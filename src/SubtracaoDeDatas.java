import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class SubtracaoDeDatas {

	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown

	@Test
	public void subtrai1Semana() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 10,
				subtraiSemana = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes, dia-7*subtraiSemana);
		// Exercise SUT
		data = data.minusWeeks(subtraiSemana);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtrai1Ano() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1,
				subtraiAno = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano-subtraiAno, mes, dia);
		// Exercise SUT
		data = data.minusYears(subtraiAno);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiMesesNoAno() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano-1, mes, dia);
		// Exercise SUT
		data = data.minusMonths(12);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	// --- Ano Bissexto

	@Test
	public void subtraiDiasNoAnoBissexto() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano-1, mes, dia);
		// Exercise SUT
		data = data.minusDays(366);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmFevereiroNoAnoBissexto() {
		// Fixture Setup
		int ano = 2016, mes = 3, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(29);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	// --- Ano não-Bissexto

	@Test
	public void subtraiDiasNoAno() {
		// Fixture Setup
		int ano = 2018, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano-1, mes, dia);
		// Exercise SUT
		data = data.minusDays(365);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmJaneiro() {
		// Fixture Setup
		int ano = 2017, mes = 2, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmFevereiro() {
		// Fixture Setup
		int ano = 2017, mes = 3, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(28);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmMarco() {
		// Fixture Setup
		int ano = 2017, mes = 4, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmAbril() {
		// Fixture Setup
		int ano = 2017, mes = 5, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmMaio() {
		// Fixture Setup
		int ano = 2017, mes = 6, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmJunho() {
		// Fixture Setup
		int ano = 2017, mes = 7, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmJulho() {
		// Fixture Setup
		int ano = 2017, mes = 8, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmAgosto() {
		// Fixture Setup
		int ano = 2017, mes = 9, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmSetembro() {
		// Fixture Setup
		int ano = 2017, mes = 10, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmOutubro() {
		// Fixture Setup
		int ano = 2017, mes = 11, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmNovembro() {
		// Fixture Setup
		int ano = 2017, mes = 12, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes-1, dia);
		// Exercise SUT
		data = data.minusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void subtraiDiasEmDezembro() {
		// Fixture Setup
		LocalDate data = new LocalDate(2018, 1, 1);
		LocalDate expected = new LocalDate(2017, 12, 1);
		// Exercise SUT
		data = data.minusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}
}
