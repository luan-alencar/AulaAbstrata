package vestibular.comparador;

import java.util.Comparator;

import vestibular.entidades.Candidato;

public class CandidatosOrdenadosPorIdadeAsc implements Comparator<Candidato> {

	@Override
	public int compare(Candidato o1, Candidato o2) {
//		return o1.getDataDeNascimento().compareTo(o2.getDataDeNascimento());
		if (o1.getDataDeNascimento() < o2.getDataDeNascimento()) {
			return -1;
		} else if (p1.getPreco() > p2.getPreco()) {
			return +1;
		}
		

	}

}
