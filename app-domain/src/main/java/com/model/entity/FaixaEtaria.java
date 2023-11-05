package com.model.entity;

public class FaixaEtaria {
	private Integer de;
	private Integer ate;

	public Integer getDe() {
		return de;
	}

	public void setDe(Integer de) {
		this.de = de;
	}

	public Integer getAte() {
		return ate;
	}

	public void setAte(Integer ate) {
		this.ate = ate;
	}

	public FaixaEtaria() {
	}

	public FaixaEtaria(Integer de, Integer ate) {
		this.de = de;
		this.ate = ate;
	}

	public Boolean isAbaixo(FaixaEtaria faixaEtaria) {
		return false;
	}
}
