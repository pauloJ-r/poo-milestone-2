package milestone.banco.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import milestone.banco.model.Cliente;
import milestone.banco.model.Conta;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

	private Cliente cliente;

	@BeforeEach
	void setUp() {
		cliente = new Cliente("12345678900", "José Silva");
	}

	@Test
	void testAdicionarConta() {
		Conta conta1 = new Conta("12345", new BigDecimal("500.00"), LocalDateTime.now());
		assertTrue(cliente.adicionarConta(conta1), "Deve ser possível adicionar a conta.");
		assertFalse(cliente.adicionarConta(conta1), "Não deve ser possível adicionar uma conta duplicada.");
	}

	@Test
	void testRemoverConta() {
		Conta conta1 = new Conta("12345", new BigDecimal("500.00"), LocalDateTime.now());
		cliente.adicionarConta(conta1);
		assertTrue(cliente.removerConta("12345"), "Deve ser possível remover a conta existente.");
		assertFalse(cliente.removerConta("12345"), "Não deve ser possível remover uma conta que não existe.");
	}

	@Test
	void testAdicionarContaExistente() {
		Conta conta = new Conta("12345", new BigDecimal("1000.00"), LocalDateTime.now());
		assertTrue(cliente.adicionarConta(conta), "A conta deve ser adicionada com sucesso.");
		assertFalse(cliente.adicionarConta(conta), "Não deve ser possível adicionar uma conta duplicada.");
	}

	@Test
	void testRemoverContaExistente() {
		Conta conta = new Conta("12345", new BigDecimal("1000.00"), LocalDateTime.now());
		cliente.adicionarConta(conta);
		assertTrue(cliente.removerConta("12345"), "A conta deve ser removida com sucesso.");
		assertFalse(cliente.removerConta("12345"), "Não deve ser possível remover uma conta que não existe.");
	}

	@Test
	void testLocalizarConta() {
		Conta conta1 = new Conta("12345", new BigDecimal("500.00"), LocalDateTime.now());
		cliente.adicionarConta(conta1);
		assertNotNull(cliente.localizarConta("12345"), "A conta deve ser encontrada.");
	}

}
