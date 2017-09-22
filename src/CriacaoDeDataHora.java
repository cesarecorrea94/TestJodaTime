import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.junit.Test;


public class CriacaoDeDataHora {

	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown

	@Test
	public void criaDataHoraValido() {
		// Fixture Setup
		int ano = 2017, mes = 8, dia = 14,
				hora = 17, min = 43, seg = 32;
		// Exercise SUT
		DateTime datahora = new DateTime(ano, mes, dia, hora, min, seg);
		// Result Verification
		assertEquals("ano",		ano,	datahora.getYear());
		assertEquals("mes",		mes,	datahora.getMonthOfYear());
		assertEquals("dia",		dia,	datahora.getDayOfMonth());
		assertEquals("hora",	hora,	datahora.getHourOfDay());
		assertEquals("minuto",	min,	datahora.getMinuteOfHour());
		assertEquals("segundo",	seg,	datahora.getSecondOfMinute());
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMesNegativo() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, -1, 1, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMesInvalido() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 13, 1, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaNegativo() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, -1, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaInvalido() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 32, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaDeFevereiroInvalido() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 2, 29, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test
	public void criaUltimoDiaDeFevereiroBissexto() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2016, 2, 29, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaHoraNegativa() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, -1, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaHoraInvalida() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 24, 0);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaMinutoNegativo() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 0, -1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMinutoInvalido() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 0, 60);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaSegundoNegativo() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 0, 0, -1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaSegundoInvalido() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 0, 0, 60);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaMiliSegundoNegativo() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 0, 0, 0, -1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMiliSegundoInvalido() {
		// Fixture Setup
		// Exercise SUT
		new DateTime(2017, 1, 1, 0, 0, 0, 1000);
		// Result Verification
		// Fixture Teardown
	}
}
