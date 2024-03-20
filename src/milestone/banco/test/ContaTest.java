package milestone.banco.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import milestone.banco.model.Conta;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    private Conta conta;

    @BeforeEach
    void setUp() {
        conta = new Conta("12345", new BigDecimal("1000.00"), LocalDateTime.now());
    }

    @Test
    void sacar() {
        conta.sacar(new BigDecimal("100.00"));
        assertEquals(new BigDecimal("900.00"), conta.getSaldo());
    }

    @Test
    void depositar() {
        conta.depositar(new BigDecimal("200.00"));
        assertEquals(new BigDecimal("1200.00"), conta.getSaldo());
    }

    @Test
    void transferir() {
        Conta contaDestino = new Conta("54321", new BigDecimal("500.00"), LocalDateTime.now());
        conta.transferir(contaDestino, new BigDecimal("300.00"));
        assertEquals(new BigDecimal("700.00"), conta.getSaldo());
        assertEquals(new BigDecimal("800.00"), contaDestino.getSaldo());
    }
    
}
