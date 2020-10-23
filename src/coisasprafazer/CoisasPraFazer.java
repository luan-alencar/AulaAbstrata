package coisasprafazer;

import java.util.Scanner;

import coisasprafazer.bancodedados.BancoDeDados;
import coisasprafazer.entidades.Tarefa;

public class CoisasPraFazer {
	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados();
		Scanner teclado = new Scanner(System.in);
		
		while (true) {
			System.out.println("Opções:");
			System.out.println("1. Adicionar tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Sair");
			System.out.print("Digite sua opção: ");
			
			int opcao = Integer.parseInt(teclado.nextLine());
			
			if (opcao == 1) { // adicionar uma tarefa
				System.out.print("Título: ");
				String titulo = teclado.nextLine();
				System.out.print("Descrição: ");
				String descricao = teclado.nextLine();
				
				Tarefa novaTarefa = new Tarefa(titulo, descricao);
				bd.adicionarTarefa(novaTarefa);
			} else if (opcao == 2) { // listar tarefas
				for (Tarefa t : bd.getTarefas()) {
					System.out.println(t);
				}
			} else if (opcao == 3) {
				break; // sair da aplicação
			} else {
				System.out.println("Digite uma opção válida !");
			}
		}
		
		teclado.close();
	}
}
