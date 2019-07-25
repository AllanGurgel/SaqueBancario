package model.entities;

import model.exceptions.DomainExceptions;

public class Conta {
private Integer numConta;
private String titular;
private Double saldo;
private Double limiteSaque;

public Conta() {
	
}

public Conta(Integer numConta, String titular, Double saldo, Double limiteSaque) {
	this.numConta = numConta;
	this.titular = titular;
	this.saldo = saldo;
	this.limiteSaque = limiteSaque;
}

public Integer getNumConta() {
	return numConta;
}

public void setNumConta(Integer numConta) {
	this.numConta = numConta;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public Double getLimiteSaque() {
	return limiteSaque;
}

public void setLimiteSaque(Double limiteSaque) {
	this.limiteSaque = limiteSaque;
}

public Double getSaldo() {
	return saldo;
}
public void deposito(double valor) {
	this.saldo += valor;
}
public void saque(double valor ) throws DomainExceptions
{
	if(valor > this.limiteSaque) {
		throw new DomainExceptions("Valor superior ao limite de saque.\n Opera��o n�o realizada.");
	}
	else if (valor > this.saldo) {
		throw new DomainExceptions("Valor superior ao saldo dispon�vel. \n Opera��o n�o realizada.");

	}
	else
	{
	this.saldo-=valor;
	}
}
@Override
public String toString() {
	return "N�mero da conta"+ getNumConta() +"| Titular : "+getTitular()+ " | Saldo : "+getSaldo()+" | Limite de saque : "+getLimiteSaque();
}

}
