import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParticipanteTest {
	Participante p1 = new Participante();

	@Test
	public void testSetNome() {
		p1.setNome("Nome");
		assertEquals("Name", p1.getNome());
	}
	
	@Test
	public void testSetIdade() {
		p1.setIdade(39);
		assertEquals(42, p1.getIdade());
	}

}
