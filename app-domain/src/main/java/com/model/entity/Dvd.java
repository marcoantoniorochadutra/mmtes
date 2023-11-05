package com.model.entity;

import com.model.base.Genero;
import com.model.base.Pessoa;

public class Dvd {

	private String titulo;
	private String sinopse;
	private Pessoa diretor;
	private Pessoa artistaPrincipal;
	private FaixaEtaria classificacao;
	private Genero genero;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Pessoa getDiretor() {
		return diretor;
	}

	public void setDiretor(Pessoa diretor) {
		this.diretor = diretor;
	}

	public Pessoa getArtistaPrincipal() {
		return artistaPrincipal;
	}

	public void setArtistaPrincipal(Pessoa artistaPrincipal) {
		this.artistaPrincipal = artistaPrincipal;
	}


	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public FaixaEtaria getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(FaixaEtaria classificacao) {
		this.classificacao = classificacao;
	}

	public Dvd(String titulo, String sinopse, Pessoa diretor, Pessoa artistaPrincipal, FaixaEtaria classificacao,
			Genero genero) {
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.diretor = diretor;
		this.artistaPrincipal = artistaPrincipal;
		this.classificacao = classificacao;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Dvd [titulo=" + titulo + ", sinopse=" + sinopse + ", diretor=" + diretor + ", artistaPrincipal="
				+ artistaPrincipal + ", classificacao=" + classificacao + ", genero=" + genero + "]";
	}


}
