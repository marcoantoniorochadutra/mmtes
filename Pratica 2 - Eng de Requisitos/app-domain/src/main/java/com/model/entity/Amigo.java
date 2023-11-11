package com.model.entity;

import com.model.base.Pessoa;

public class Amigo extends Pessoa{

	private Long numTelefone;
	private String email;
	private String endereco;
	private FaixaEtaria faixaEtaria;
		
	public Long getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(Long numTelefone) {
		this.numTelefone = numTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public FaixaEtaria getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Amigo(String nome, Long numTelefone, String email, String endereco, FaixaEtaria faixaEtaria) {
		super(nome);
		this.numTelefone = numTelefone;
		this.email = email;
		this.endereco = endereco;
		this.faixaEtaria = faixaEtaria;
	}

	public Amigo() {
	}

	@Override
	public String toString() {
		return "Amigo [numTelefone=" + numTelefone + ", email=" + email + ", endereco=" + endereco + "]";
	}

}
