package xadrez;

import tabuleiro.Peca;
import tabuleiro.TabuleiroDeJogo;

public class PecaDeXadrez extends Peca {

	private Cor cor_da_peca;

	public PecaDeXadrez(TabuleiroDeJogo tabuleiro, Cor cor_da_peca) {
		super(tabuleiro);
		this.cor_da_peca = cor_da_peca;
	}

	public Cor getCor_da_peca() {
		return cor_da_peca;
	}

	
}
