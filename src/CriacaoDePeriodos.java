import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.junit.Test;

public class CriacaoDePeriodos {

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
	public void criaPeriodoValido() {
		// Fixture Setup
		int years = 11, months = -53, weeks = 143, days = -424,
			hours = 32, minutes = -7, seconds = 87, millis = -6735;
		java.time.Period jtP = java.time.Period.of(years, months, days);
		// Exercise SUT
		Period periodo = new Period(years, months, weeks, days, hours, minutes, seconds, millis);
		// Result Verification
		assertEquals("anos",			jtP.getYears(),		periodo.getYears());
		assertEquals("meses",			jtP.getMonths(),	periodo.getMonths());
		assertEquals("dias",			jtP.getDays(),		periodo.getDays());
		
		assertEquals("anos",			years,		periodo.getYears());
		assertEquals("meses",			months,		periodo.getMonths());
		assertEquals("semanas",			weeks,		periodo.getWeeks());
		assertEquals("dias",			days,		periodo.getDays());
		assertEquals("horas",			hours,		periodo.getHours());
		assertEquals("minutos",			minutes,	periodo.getMinutes());
		assertEquals("segundos",		seconds,	periodo.getSeconds());
		assertEquals("milissegundos",	millis,		periodo.getMillis());
		// Fixture Teardown
	}
	
	@Test
	public void criaPeriodoIdadeJava() {
		// Fixture Setup
		int anoJava = 1995, mesJava = 5, diaJava = 23;
		LocalDate javaBirthday = new LocalDate(anoJava, mesJava, diaJava);
		int anoHoje = 2017, mesHoje = 8, diaHoje = 12;
		LocalDate today = new LocalDate(anoHoje, mesHoje, diaHoje);
		int mesAnt = mesHoje-1;
		// Exercise SUT
		Period oi = Period.fieldDifference(javaBirthday, today);
		// Result Verification
		assertEquals("anos",	anoHoje-anoJava,					oi.getYears());
		assertEquals("meses",	mesHoje-mesJava -1,					oi.getMonths());
		assertEquals("dias",	diaHoje-diaJava +diasNoMes[mesAnt],	oi.getDays());
		// Fixture Teardown
	}
}
