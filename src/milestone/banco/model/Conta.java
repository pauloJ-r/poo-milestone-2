package milestone.banco.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/*
 * Programação Orientada a Objetos
 * Milestone 2
 * Discente:
 * 
 */
public class Conta {
    private String numero;
    private BigDecimal saldo;
    private LocalDateTime dataAbertura;
    private boolean status;

    public Conta(String numero, BigDecimal saldoInicial, LocalDateTime dataAbertura) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.saldo.setScale(2);
        this.dataAbertura = dataAbertura;
     // Supondo que a conta esteja ativa ao ser criada
        this.status = true; 
    }

    /*
     * Método recebe um valor do tipo BigDecimal que deve ser decrementado
     * do atributo saldo, caso a conta esteja ativa, o valor seja maior que zero (0)
     * e menor que o saldo disponível. No caso em que as condições não sejam 
     * atendidas, declare o seguinte statement na condicional: 
     * throw new IllegalArgumentException("Saldo insuficiente ou conta inativa.");
     */
    public void sacar(BigDecimal valor) {
        
    }

    /*
     * Método recebe um valor do tipo BigDecimal que deve incrementado
     * ao atributo saldo, caso a conta esteja ativa, o valor seja maior que zero (0) 
     * e menor que o saldo disponível. No caso em que as condições não sejam 
     * atendidas, declare o seguinte statement na condicional: 
     * throw new IllegalArgumentException("Saldo insuficiente ou conta inativa.");
     */
    public void depositar(BigDecimal valor) {
        
    }

    /*
     * Método recebe um valor do tipo BigDecimal e um objeto do tipo conta. O valor 
     * passado como argumento deve  que deve decrementado da conta de origem, e 
     * incrementado na conta destino passada no argumento. Para a operação ser realizada
     * tanto a conta de origem e destino devem estar ativa, bem como o valor seja maior 
     * que zero (0) e menor que o saldo disponível da conta de origem. 
     * No caso em que as condições não sejam atendidas, declare o seguinte statement na condicional: 
     * throw new IllegalArgumentException("Saldo insuficiente ou conta inativa.");
     */
    public void transferir(Conta destino, BigDecimal valor) {
        
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numero, other.numero);
	}

	// Métodos getters e setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
