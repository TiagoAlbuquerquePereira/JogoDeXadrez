package tabuleiro;

public class TabuleiroDeJogo {

	private int linhas;
	private int colunas;
	private Peca[][] pecas_do_tabuleiro;

	public TabuleiroDeJogo(int linhas, int colunas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		pecas_do_tabuleiro = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public Peca peca(int linha, int coluna) {

		return pecas_do_tabuleiro[linha][coluna];

	}

	public Peca peca(Posicao posicao) {
		return pecas_do_tabuleiro[posicao.getLinha()][posicao.getColuna()];

	}

	public void colocar_Peca(Peca peca, Posicao posicao) {
		pecas_do_tabuleiro[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

}
