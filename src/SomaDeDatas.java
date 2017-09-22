import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class SomaDeDatas {

	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown

	@Test
	public void soma1Semana() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1,
				somaSemana = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes, dia+7*somaSemana);
		// Exercise SUT
		data = data.plusWeeks(somaSemana);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void soma1Ano() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1,
				somaAno = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano+somaAno, mes, dia);
		// Exercise SUT
		data = data.plusYears(somaAno);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaMesesNoAno() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano+1, mes, dia);
		// Exercise SUT
		data = data.plusMonths(12);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	// --- Ano Bissexto

	@Test
	public void somaDiasNoAnoBissexto() {
		// Fixture Setup
		int ano = 2016, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano+1, mes, dia);
		// Exercise SUT
		data = data.plusDays(366);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmFevereiroNoAnoBissexto() {
		// Fixture Setup
		int ano = 2016, mes = 2, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(29);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	// --- Ano não-Bissexto

	@Test
	public void somaDiasNoAno() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano+1, mes, dia);
		// Exercise SUT
		data = data.plusDays(365);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmJaneiro() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmFevereiro() {
		// Fixture Setup
		int ano = 2017, mes = 2, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(28);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmMarco() {
		// Fixture Setup
		int ano = 2017, mes = 3, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmAbril() {
		// Fixture Setup
		int ano = 2017, mes = 4, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmMaio() {
		// Fixture Setup
		int ano = 2017, mes = 5, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmJunho() {
		// Fixture Setup
		int ano = 2017, mes = 6, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmJulho() {
		// Fixture Setup
		int ano = 2017, mes = 7, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmAgosto() {
		// Fixture Setup
		int ano = 2017, mes = 8, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmSetembro() {
		// Fixture Setup
		int ano = 2017, mes = 9, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmOutubro() {
		// Fixture Setup
		int ano = 2017, mes = 10, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmNovembro() {
		// Fixture Setup
		int ano = 2017, mes = 11, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano, mes+1, dia);
		// Exercise SUT
		data = data.plusDays(30);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}

	@Test
	public void somaDiasEmDezembro() {
		// Fixture Setup
		int ano = 2017, mes = 12, dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate expected = new LocalDate(ano+mes/12, mes%12+1, dia);
		// Exercise SUT
		data = data.plusDays(31);
		// Result Verification
		assertEquals(expected, data);
		// Fixture Teardown
	}
}
