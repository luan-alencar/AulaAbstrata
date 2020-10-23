package coisasprafazer.entidades;

import java.io.Serializable;

public class Tarefa implements Serializable {
	private String titulo;
	private String descricao;

	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return titulo + ": " + descricao;
	}
}
