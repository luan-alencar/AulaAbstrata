package coisasprafazer.bancodedados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import coisasprafazer.entidades.Tarefa;

public class BancoDeDados {
	private static final String ARQUIVO = "tarefas.db";
	
	private List<Tarefa> tarefas = new ArrayList<>();
	
	public BancoDeDados() {
		// tenta carregar do arquivo
		carregar();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa); // adiciona na lista
		salvar(); // salva no arquivo
	}
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
	private void salvar() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO));
			oos.writeObject(tarefas);
			oos.close();
		} catch (Exception ex) {
			System.err.println("Não foi possível salvar: " + ex);
		}
	}
	
	private void carregar() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO));
			tarefas = (List<Tarefa>)ois.readObject();
			ois.close();
		} catch (Exception ex) {
			System.err.println("Não foi possível carregar: " + ex);
		}
	}
}
