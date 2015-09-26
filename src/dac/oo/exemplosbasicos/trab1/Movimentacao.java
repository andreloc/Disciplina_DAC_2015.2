package dac.oo.exemplosbasicos.trab1;

import java.util.Date;

public class Movimentacao {

	private double valorMovimentado;
	private Date dataHoraMovimentacao;
	
	public Movimentacao(
			double valorMovimentado) {
		super();
		this.valorMovimentado = valorMovimentado;
		this.dataHoraMovimentacao = new Date(); 
	}

	public Movimentacao(
			double valorMovimentado,
			Date dtHoraMov) {
		super();
		this.valorMovimentado = valorMovimentado;
		this.dataHoraMovimentacao = dtHoraMov;
	}

	public double getValorMovimentado() {
		return valorMovimentado;
	}

	public Date getDataHoraMovimentacao() {
		return dataHoraMovimentacao;
	}
	
}
