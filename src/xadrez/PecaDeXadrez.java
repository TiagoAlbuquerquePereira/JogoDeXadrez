package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.TabuleiroDeJogo;

public abstract class PecaDeXadrez extends Peca {

	private Cor cor_da_peca;

	public PecaDeXadrez(TabuleiroDeJogo tabuleiro, Cor cor_da_peca) {
		super(tabuleiro);
		this.cor_da_peca = cor_da_peca;
	}

	public Cor getCor_da_peca() {
		return cor_da_peca;
	}

	protected boolean existe_Peca_oponente(Posicao posicao) {

		PecaDeXadrez p = ((PecaDeXadrez) getTabuleiro().peca(posicao));
		return p != null && p.getCor_da_peca() != cor_da_peca;
	}

}
