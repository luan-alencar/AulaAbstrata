package vestibular.comparador;

import java.util.Comparator;

import vestibular.entidades.Candidato;

public class CandidatosOrdenadosPorIdadeDesc implements Comparator<Candidato> {

	@Override
	public int compare(Candidato c1, Candidato c2) {
		return c1.getDataDeNascimento().compareTo(c2.getDataDeNascimento());
	}

}
