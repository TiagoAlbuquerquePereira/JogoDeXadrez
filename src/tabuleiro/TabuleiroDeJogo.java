package tabuleiro;

public class TabuleiroDeJogo {

	private int linhas;
	private int colunas;
	private Peca[][] pecas_do_tabuleiro;

	public TabuleiroDeJogo(int linhas, int colunas) {
		super();
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException(
					"Erro ao criar tabuleiro. O n�mero de linhas e colunas n�o podem ser menores que 1");

		}

		this.linhas = linhas;
		this.colunas = colunas;
		pecas_do_tabuleiro = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!existe_Posicao(linha, coluna)) {

			throw new TabuleiroException("A posi��o informada est� fora do tabuleiro");

		}

		return pecas_do_tabuleiro[linha][coluna];

	}

	public Peca peca(Posicao posicao) {

		if (!existe_Posicao(posicao)) {

			throw new TabuleiroException("A posi��o informada est� fora do tabuleiro");
		}

		return pecas_do_tabuleiro[posicao.getLinha()][posicao.getColuna()];

	}

	public void colocar_Peca(Peca peca, Posicao posicao) {
		if (existe_Peca(posicao)) {

			throw new TabuleiroException("J� existe uma pe�a na posi��o" + posicao);

		}

		pecas_do_tabuleiro[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean existe_Posicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	};

	public boolean existe_Posicao(Posicao posicao) {
		return existe_Posicao(posicao.getLinha(), posicao.getColuna());
	}

	public boolean existe_Peca(Posicao posicao) {
		if (!existe_Posicao(posicao)) {

			throw new TabuleiroException("A posi��o informada est� fora do tabuleiro");

		}

		return peca(posicao) != null;

	}

}
