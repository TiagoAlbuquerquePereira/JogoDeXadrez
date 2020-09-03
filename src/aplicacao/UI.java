package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PecaDeXadrez;
import xadrez.PosicaoDeXadrez;

public class UI {

	public static void limparTela() {
		System.out.flush();

	}

	public static PosicaoDeXadrez lerPosicaoPeca(Scanner sc) {

		try {
			String S = sc.nextLine();
			char coluna = S.charAt(0);
			int linha = Integer.parseInt(S.substring(1));
			return new PosicaoDeXadrez(coluna, linha);
		} catch (RuntimeException e) {

			throw new InputMismatchException("Erro ao ler posição de Xadrez");
		}
	}

	public static void imprimirtabuleiro(PecaDeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimirPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
	}

	private static void imprimirPeca(PecaDeXadrez peca) {

		if (peca == null) {

			System.out.print("-");
		}

		else {
			System.out.print(peca);

		}

		System.out.print(" ");
	}

}
