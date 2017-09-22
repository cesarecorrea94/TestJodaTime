import static org.junit.Assert.*;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.junit.Test;

public class CriacaoDeDatas {
	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown
	int diasNoMes[] = {0,//Mes[0] Inexiste
			31,28,31,//Ja Fe Ma
			30,31,30,//Ab Ma Ju
			31,31,30,//Ju Ag Se
			31,30,31};//Ou No De
	
	@Test
	public void criaUltimoDiaDeFevereiroNoAnoBissexto() {
		// Fixture Setup
		int ano = 2016, mes = 2, dia = diasNoMes[2]+1;
		// Exercise SUT
		LocalDate data = new LocalDate(ano, mes, dia);
		// Result Verification
		assertEquals("ano",	ano,	data.getYear());
		assertEquals("mes",	mes,	data.getMonthOfYear());
		assertEquals("dia",	dia,	data.getDayOfMonth());
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaMesNegativo() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, -1, 1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMesQueExcedeMesesNoAno() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 13, 1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaNegativo() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 1, -1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeJaneiro() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 1, diasNoMes[1]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeFevereiro() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 2, diasNoMes[2]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeFevereiroNoAnoBissexto() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2016, 2, diasNoMes[2]+2);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeMarco() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 3, diasNoMes[3]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeAbril() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 4, diasNoMes[4]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeMaio() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 5, diasNoMes[5]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeJunho() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 6, diasNoMes[6]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeJulho() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 7, diasNoMes[7]+1);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeAgosto() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 8, diasNoMes[8]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeSetembro() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 9, diasNoMes[9]+1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeOutubro() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 10, diasNoMes[10]+1);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeNovembro() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 11, diasNoMes[11]+1);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaDiaQueExcedeDezembro() {
		// Fixture Setup
		// Exercise SUT
		new LocalDate(2017, 12, diasNoMes[12]+1);
		// Result Verification
		// Fixture Teardown
	}
}
