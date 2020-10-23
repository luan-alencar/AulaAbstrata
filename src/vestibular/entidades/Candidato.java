package vestibular.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import vestibular.excecoes.DataInvalidaException;

public class Candidato {
	// Formatter responsável por converter data em string e vice-versa
	private static final DateFormat FORMATO_DATA = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private double nota;
	private Date dataDeNascimento;
	private String curso;

	public Candidato(String nome, double nota, String dataDeNascimentoStr, String curso) {
		this.nome = nome;
		this.nota = nota;
		
		try {
			this.dataDeNascimento = FORMATO_DATA.parse(dataDeNascimentoStr);
		} catch (ParseException e) {
			throw new DataInvalidaException(dataDeNascimentoStr);
		}
		
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return String.format("| %-25s | %3.1f | %-20s | %s |", curso, nota, nome, FORMATO_DATA.format(dataDeNascimento));
	}
}
