package xadrez;

import tabuleiro.Peca;
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

	public PecaDeXadrez fazerMovimento(PosicaoDeXadrez posicaoDeOrigem, PosicaoDeXadrez PosicaoFinal) {

		Posicao origem = posicaoDeOrigem.toPosicao();
		Posicao posicao_Final = PosicaoFinal.toPosicao();
		validarPosicaoDeOrigem(origem);
		Peca peca_Capturada = fazer_Movimento(origem, posicao_Final);
		return (PecaDeXadrez) peca_Capturada;
	}

	private Peca fazer_Movimento(Posicao posicaoDeOrigem, Posicao PosicaoFinal) {
		Peca p = Tabuleiro_De_Jogo.remover_Peca(posicaoDeOrigem);
		Peca peca_Capturada = Tabuleiro_De_Jogo.remover_Peca(PosicaoFinal);
		Tabuleiro_De_Jogo.colocar_Peca(p, PosicaoFinal);
		return peca_Capturada;
	}

	private void validarPosicaoDeOrigem(Posicao posicao) {
		if (!Tabuleiro_De_Jogo.existe_Peca(posicao)) {
			throw new xadrezException("A posição está fora do tabuleiro");

		}

	}

	private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		Tabuleiro_De_Jogo.colocar_Peca(peca, new PosicaoDeXadrez(coluna, linha).toPosicao());

	}

	private void setupinicial() {

		colocarNovaPeca('b', 6, new Torre(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('e', 8, new Rei(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('e', 1, new Rei(Tabuleiro_De_Jogo, Cor.WHITE));
	}

}
