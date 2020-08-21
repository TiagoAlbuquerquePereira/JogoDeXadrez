package xadrez;

import tabuleiro.TabuleiroDeJogo;

public class PartidaDeXadrez {

	private TabuleiroDeJogo Tabuleiro_De_Jogo;

	public PartidaDeXadrez() {

		Tabuleiro_De_Jogo = new TabuleiroDeJogo(8, 8);

	}

	public PecaDeXadrez[][] pegar_pecas() {
		PecaDeXadrez[][] matriz_de_pecas = new PecaDeXadrez[Tabuleiro_De_Jogo.getLinhas()][Tabuleiro_De_Jogo
				.getColunas()];
		for (int i = 0; i < Tabuleiro_De_Jogo.getLinhas(); i++) {

			for (int j = 0; j < Tabuleiro_De_Jogo.getColunas(); j++) {

				matriz_de_pecas[i][j] = (PecaDeXadrez) Tabuleiro_De_Jogo.peca(i, j);

			}

		}

		return matriz_de_pecas;

	}

}
