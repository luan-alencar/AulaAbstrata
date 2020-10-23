package vestibular.bancodedados;

import java.util.Arrays;
import java.util.List;

import vestibular.entidades.Candidato;

public class BancoDeDados {
	private static Candidato[] candidatos = new Candidato[] {
			new Candidato("José da Silva", 758.5, "10/10/2000", "Sistemas de Informação"),
			new Candidato("Maria da Silva", 970.2, "11/09/1982", "Sistemas de Informação"),
			new Candidato("Ana da Silva", 500.2, "12/08/2001", "Jogos Digitais"),
			new Candidato("Pedro da Silva", 758.3, "13/07/2002", "Sistemas de Informação"),
			new Candidato("Antônio da Silva", 675.5, "14/06/1994", "Direito"),
			new Candidato("Júlio da Silva", 820.8, "16/05/2001", "Sistemas de Informação"),
			new Candidato("Bruno da Silva", 630.9, "17/04/1999", "Jogos Digitais"),
			new Candidato("Sofia da Silva", 440.2, "18/03/1998", "Jogos Digitais"),
			new Candidato("Daniela da Silva", 350.1, "19/02/2000", "Direito"),
			new Candidato("Henrique da Silva", 260.2, "20/01/2000", "Sistemas de Informação"),
	};
	
	public static List<Candidato> getCandidatos() {
		return Arrays.asList(candidatos);
	}
}
