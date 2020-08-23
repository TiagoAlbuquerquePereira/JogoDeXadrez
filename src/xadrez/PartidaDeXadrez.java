package xadrez;

import tabuleiro.Posicao;
import tabuleiro.TabuleiroDeJogo;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private TabuleiroDeJogo Tabuleiro_De_Jogo;

	public PartidaDeXadrez() {

		Tabuleiro_De_Jogo = new TabuleiroDeJogo(8, 8);
		setupinicial();
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

	private void setupinicial() {

		Tabuleiro_De_Jogo.colocar_Peca(new Torre(Tabuleiro_De_Jogo, Cor.WHITE), new Posicao(2, 1));
		Tabuleiro_De_Jogo.colocar_Peca(new Rei(Tabuleiro_De_Jogo, Cor.BLACK), new Posicao(0, 4));
	}

}
