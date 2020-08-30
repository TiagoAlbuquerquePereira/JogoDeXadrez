package xadrez;

import tabuleiro.Posicao;

public class PosicaoDeXadrez {

	private char coluna;
	private int linha;

	public PosicaoDeXadrez(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {

			throw new xadrezException("Erro ao instanciar a posição, os valores têm que estar entre 1 e 8");
		}

		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao toPosicao() {

		return new Posicao(8 - linha, coluna - 'a');
	}

	protected static PosicaoDeXadrez dePosicao(Posicao posicao) {

		return new PosicaoDeXadrez((char) ('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}

	public String toString() {
		return "" + coluna + linha;
	}

}
