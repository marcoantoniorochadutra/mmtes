package com.model.entity;

import java.time.Instant;

public class Emprestimo {

	private Instant dataDevolucao;
	private Instant dataEmprestimo;
	private Amigo amigo;
	private Dvd dvd;

	public Instant getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Instant dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Instant getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Instant dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Amigo getAmigo() {
		return amigo;
	}

	public void setAmigo(Amigo amigo) {
		this.amigo = amigo;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public Emprestimo(Instant dataDevolucao, Instant dataEmprestimo, Amigo amigo, Dvd dvd) {
		this.dataDevolucao = dataDevolucao;
		this.dataEmprestimo = dataEmprestimo;
		this.amigo = amigo;
		this.dvd = dvd;
	}

	public Emprestimo() {
	}

}
