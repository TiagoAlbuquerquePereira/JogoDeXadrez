package xadrez.pecas;

import tabuleiro.TabuleiroDeJogo;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

	public Torre(TabuleiroDeJogo tabuleiro, Cor cor_da_peca) {
		super(tabuleiro, cor_da_peca);

	}

	@Override
	public String toString() {
		return "T";
	}

}
