package tabuleiro;

public class Peca {

	protected Posicao posicao;
	private TabuleiroDeJogo tabuleiro;

	public Peca(TabuleiroDeJogo tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	public TabuleiroDeJogo getTabuleiro() {
		return tabuleiro;
	}

	protected void setTabuleiro(TabuleiroDeJogo tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

}
