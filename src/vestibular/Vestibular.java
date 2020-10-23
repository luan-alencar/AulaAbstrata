package vestibular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vestibular.bancodedados.BancoDeDados;
import vestibular.comparador.ComparadorCandidatoPorNome;
import vestibular.entidades.Candidato;

public class Vestibular {
	public List<Candidato> getCandidatosOrdenadosPorNome(String curso) {
		return extracted(curso);
	}

	public List<Candidato> getCandidatosOrdenadosPorIdadeAsc(String curso) {
		return extracted(curso);
	}

	public List<Candidato> getCandidatosOrdenadosPorIdadeDesc(String curso) {
		return extracted(curso);
	}

	public List<Candidato> getCandidatosOrdenadosPorNotaAsc(String curso) {
		return extracted(curso);
	}

	public List<Candidato> getCandidatosOrdenadosPorNotaDesc(String curso) {
		return extracted(curso);
	}

	private List<Candidato> extracted(String curso) {
		List<Candidato> candidatos = BancoDeDados.getCandidatos();

		// Primeiro, filtro os candidatos pelo curso
		List<Candidato> candidatosFiltrados = new ArrayList<>();
		for (Candidato c : candidatos) {
			if (c.getCurso().equals(curso)) {
				candidatosFiltrados.add(c);
			}
		}
		// Ordenar os candidatos já filtrados
		Collections.sort(candidatosFiltrados, new ComparadorCandidatoPorNome());

		return candidatosFiltrados;
	}

	public static void main(String[] args) {
		Vestibular v = new Vestibular();

		System.out.println("Candidatos para o curso de SI ordendos por nome:");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		System.out.println("| CURSO                     | NOTA  | NOME                 | DT. NASC   |");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		for (Candidato c : v.getCandidatosOrdenadosPorNome("Sistemas de Informação")) {
			System.out.println(c);
		}
		System.out.println("+---------------------------+-------+----------------------+------------+");

		// Mostre os candidatos ordenados por nota (da maior para menor) para o curso de
		// jogos
		// Mostre os candidatos ordenados por nota (da menor para maior) para o curso de
		// SI
		// Mostre os candidatos ordenados por idade (da maior para menor) para o curso
		// de jogos
		// Mostre os candidatos ordenados por idade (da menor para maior) para o curso
		// de SI
	}
}
