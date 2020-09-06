package xadrez.pecas;

import tabuleiro.Posicao;
import tabuleiro.TabuleiroDeJogo;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

	public Rei(TabuleiroDeJogo tabuleiro, Cor cor_da_peca) {
		super(tabuleiro, cor_da_peca);

	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possiveis_Movimentos() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];

		Posicao P = new Posicao(0, 0);

		// Testando linhas acima
		P.setValor(posicao.getLinha() - 1, posicao.getColuna());
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando linhas abaixo
		P.setValor(posicao.getLinha() + 1, posicao.getColuna());
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando colunas a esquerda
		P.setValor(posicao.getLinha(), posicao.getColuna() - 1);
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando colunas a direita
		P.setValor(posicao.getLinha(), posicao.getColuna() + 1);
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando diagonal abaixo a esquerda
		P.setValor(posicao.getLinha() - 1, posicao.getColuna() - 1);
		mat[P.getLinha()][P.getColuna()] = true;

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando diagonal abaixo a direita
		P.setValor(posicao.getLinha() - 1, posicao.getColuna() + 1);
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando diagonal acima a esquerda
		P.setValor(posicao.getLinha() + 1, posicao.getColuna() - 1);
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		// Testando diagonal acima a direita
		P.setValor(posicao.getLinha() + 1, posicao.getColuna() + 1);
		while (getTabuleiro().existe_Posicao(P) && !getTabuleiro().existe_Peca(P)) {
			mat[P.getLinha()][P.getColuna()] = true;
		}

		if (getTabuleiro().existe_Posicao(P) && existe_Peca_oponente(P)) {
			mat[P.getLinha()][P.getColuna()] = true;

		}
		return mat;
	}

}
