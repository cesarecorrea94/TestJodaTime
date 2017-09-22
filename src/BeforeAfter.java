import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

/**
 * Inicialmente pensei que after correspondia ao amanhã (e before ao ontem), mas qualquer dia depois de hoje é after.
 */
public class BeforeAfter {
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
	public void beforePrimeiroDiaDeJaneiro() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = 1,
				pre_ano = 2016, pre_mes = 12, pre_dia = diasNoMes[pre_mes]; 
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataBefore = new LocalDate(pre_ano, pre_mes, pre_dia);
		// Exercise SUT
		boolean teste = dataBefore.isBefore(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}
	
	@Test
	public void afterUltimoDiaDeJaneiro() {
		// Fixture Setup
		int ano = 2017, mes = 1, dia = diasNoMes[mes],
				pos_ano = ano, pos_mes = mes+1, pos_dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataAfter = new LocalDate(pos_ano, pos_mes, pos_dia);
		// Exercise SUT
		boolean teste = dataAfter.isAfter(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}

	@Test
	public void beforePrimeiroDiaDeFevereiro() {
		// Fixture Setup
		int ano = 2017, mes = 2, dia = 1,
				pre_ano = ano, pre_mes = mes-1, pre_dia = diasNoMes[pre_mes]; 
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataBefore = new LocalDate(pre_ano, pre_mes, pre_dia);
		// Exercise SUT
		boolean teste = dataBefore.isBefore(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}
	
	@Test
	public void afterUltimoDiaDeFevereiro() {
		// Fixture Setup
		int ano = 2017, mes = 2, dia = diasNoMes[mes],
				pos_ano = ano, pos_mes = mes+1, pos_dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataAfter = new LocalDate(pos_ano, pos_mes, pos_dia);
		// Exercise SUT
		boolean teste = dataAfter.isAfter(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}

	@Test
	public void afterUltimoDiaDeFevereiroNoAnoBissexto() {
		// Fixture Setup
		int ano = 2016, mes = 2, dia = diasNoMes[mes] + ((ano % 4 == 0 && mes == 2) ? 1 : 0),
				pos_ano = ano, pos_mes = mes+1, pos_dia = 1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataAfter = new LocalDate(pos_ano, pos_mes, pos_dia);
		// Exercise SUT
		boolean teste = dataAfter.isAfter(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}

	@Test
	public void after28DeFevereiroNoAnoBissexto() {
		// Fixture Setup
		int ano = 2016, mes = 2, dia = 28,
				pos_ano = ano, pos_mes = mes, pos_dia = dia+1;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataAfter = new LocalDate(pos_ano, pos_mes, pos_dia);
		// Exercise SUT
		boolean teste = dataAfter.isAfter(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}

	@Test
	public void before1Ano() {
		int ano = 2017, mes = 8, dia = 16,
				pre_ano = ano-1, pre_mes = mes, pre_dia = dia;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataBefore = new LocalDate(pre_ano, pre_mes, pre_dia);
		// Exercise SUT
		boolean teste = dataBefore.isBefore(data);
		// Result Verification
		assertTrue(teste);
		// Fixture Teardown
	}
	
	@Test
	public void afterDiaEMesMaior_MasAnoAnterior() {
		// Fixture Setup
		int ano = 2016, mes = 2, dia = 2,
				pos_ano = ano-1, pos_mes = mes+2, pos_dia = dia+10;
		LocalDate data = new LocalDate(ano, mes, dia);
		LocalDate dataAfter = new LocalDate(pos_ano, pos_mes, pos_dia);
		// Exercise SUT
		boolean teste = dataAfter.isAfter(data);
		// Result Verification
		assertFalse(teste);
		// Fixture Teardown
	}

}
