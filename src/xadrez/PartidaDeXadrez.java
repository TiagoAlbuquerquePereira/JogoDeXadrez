package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.TabuleiroDeJogo;
import xadrez.pecas.Bispo;
import xadrez.pecas.Cavalo;
import xadrez.pecas.Peao;
import xadrez.pecas.Rainha;
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
		
		if (!Tabuleiro_De_Jogo.peca(posicao).existe_Movimento_Possivel()) {
			throw new xadrezException("Não existem movimentos possíveis para esta peça");
			
		}

	}

	private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		Tabuleiro_De_Jogo.colocar_Peca(peca, new PosicaoDeXadrez(coluna, linha).toPosicao());

	}

	private void setupinicial() {

		colocarNovaPeca('a', 1, new Torre(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('b', 1, new Cavalo(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('c', 1, new Bispo(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('d', 1, new Rainha(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('e', 1, new Rei(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('f', 1, new Bispo(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('g', 1, new Cavalo(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('h', 1, new Torre(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('a', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('b', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('c', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('d', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('e', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('f', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('g', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		colocarNovaPeca('h', 2, new Peao(Tabuleiro_De_Jogo, Cor.WHITE));
		
		colocarNovaPeca('a', 8, new Torre(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('b', 8, new Cavalo(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('c', 8, new Bispo(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('d', 8, new Rainha(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('e', 8, new Rei(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('f', 8, new Bispo(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('g', 8, new Cavalo(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('h', 8, new Torre(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('a', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('b', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('c', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('d', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('e', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('f', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('g', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		colocarNovaPeca('h', 7, new Peao(Tabuleiro_De_Jogo, Cor.BLACK));
		
	}

}
