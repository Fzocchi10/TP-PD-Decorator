package decorator.panchObrero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import panchObrero_decorator.entity.*;

@SpringBootTest
class PanchObreroApplicationTests {

	@DisplayName("Pancho solo")
    @Test
	public void testPanchoSolo() {
    	Pancho panchoSolo = new PanchoSimple();
    	
    	assertEquals(500, panchoSolo.costoTotal());
	}

  
     @DisplayName("Pancho con mayonesa")
    
    @Test
	public void testPanchoConMayonesa() {
    	Pancho panchoBase = new PanchoSimple();
    	Pancho panchoConMayo = new Mayonesa(panchoBase);
    	assertEquals(550, panchoConMayo.costoTotal());
	}
     
    @DisplayName("Pancho con mostaza, mayonesa, ketchup y papas pay")
    @Test
	public void testPanchoMostazaMayonesaKetchupPapasPay() {
    	Pancho panchoSolo = new PanchoSimple();
    	Pancho mayonesa = new Mayonesa(panchoSolo);
    	Pancho mostaza = new Mostaza(mayonesa);
    	Pancho ketchup = new Ketchup(mostaza);
    	Pancho papasPay = new PapasPay(ketchup);
    	assertEquals(730, papasPay.costoTotal());
	}
    @DisplayName("Poder diarreico panchoConMayonesa")
    @Test
	public void testPoderDiarreicoPanchoConMayonesa() {
		Pancho panchoSolo = new PanchoSimple();
    	Pancho mayonesa = new Mayonesa(panchoSolo);
    	mayonesa.aderezoVencido();
    	assertEquals(1, mayonesa.poderDiarreico());
    }
    @DisplayName("Poder diarreico")
    @Test
	public void testPoderDiarreico() {
		Pancho panchoSolo = new PanchoSimple();
    	Pancho mayonesa = new Mayonesa(panchoSolo);
    	mayonesa.aderezoVencido();
    	Pancho mostaza = new Mostaza(mayonesa);
    	mostaza.aderezoVencido();
    	Pancho ketchup = new Ketchup(mostaza);
    	ketchup.aderezoVencido();
    	Pancho papasPay = new PapasPay(ketchup);
    	papasPay.aderezoVencido();
    	assertEquals(4, papasPay.poderDiarreico());
	}
   
    @DisplayName("Poder diarreico panchoObreroDesclasado")
    @Test
	public void testPoderDiarreicoPanchoObreroDesclasado() {
		Pancho panchoSolo = new PanchoSimple();
    	Pancho obreroDesclasado = new ObreroDesclasado(panchoSolo);
    	obreroDesclasado.aderezoVencido();
    	assertEquals(3, obreroDesclasado.poderDiarreico());
    }
}
