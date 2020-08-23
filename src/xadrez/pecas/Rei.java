package xadrez.pecas;

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

}
