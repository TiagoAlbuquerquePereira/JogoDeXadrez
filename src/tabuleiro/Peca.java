package tabuleiro;

public abstract class Peca {

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

	public abstract boolean[][] possiveis_Movimentos();

	public boolean possivel_Movimento(Posicao posicao) {

		return possiveis_Movimentos()[posicao.getLinha()][posicao.getColuna()];

	}

	public boolean existe_Movimento_Possivel() {
		boolean[][] mat = possiveis_Movimentos();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;

	}
}
