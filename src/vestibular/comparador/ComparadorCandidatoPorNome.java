package vestibular.comparador;

import java.util.Comparator;

import vestibular.entidades.Candidato;

public class ComparadorCandidatoPorNome implements Comparator<Candidato> {

	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
