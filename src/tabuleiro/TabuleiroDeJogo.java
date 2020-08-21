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

}
