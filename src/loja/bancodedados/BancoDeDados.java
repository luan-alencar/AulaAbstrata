package loja.bancodedados;

import java.util.Arrays;
import java.util.List;

import loja.entidades.Produto;

/**
 * Essa classe simula um banco de dados, contendo vários
 * produtos já pré-cadastrados.
 * 
 * @author Bruno Catão
 */
public class BancoDeDados {
	// O nosso "banco de dados" será apenas um array
	private static Produto[] produtos = new Produto[]{
			new Produto("Lavadoura de Roupas", 1288.99),
			new Produto("Smart TV Led 32''", 1199.99),
			new Produto("Notebook", 1799.99),
			new Produto("Ar Condicionado Split", 1579.05),
			new Produto("PlayStation 5", 4999.00),
			new Produto("Samsung Galaxy A10", 949.00),
			new Produto("iPhone 11", 4889.00),
			new Produto("Escova Secadora", 159.99),
			new Produto("Livro", 19.64),
			new Produto("Máscara", 34.90),
			new Produto("Gift Card", 100.00),
			new Produto("Bala de Gelatina", 4.99),
			new Produto("Boneca", 99.99),
			new Produto("LG K8+", 649.00),
			new Produto("Nintendo Switch", 3199.99)
	};
	
	public static List<Produto> getProdutos() {
		return Arrays.asList(produtos);
	}
}
