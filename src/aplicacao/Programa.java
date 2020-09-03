package aplicacao;

import java.util.Scanner;

import tabuleiro.Posicao;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoDeXadrez;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partida1 = new PartidaDeXadrez();

		while (true) {
			UI.imprimirtabuleiro(partida1.pegar_pecas());
			System.out.println();
			System.out.print("Peça que deseja mover: ");
			PosicaoDeXadrez origem = UI.lerPosicaoPeca(sc);

			System.out.println();
			System.out.print("Casa para mover a peça: ");
			PosicaoDeXadrez posicao_Final = UI.lerPosicaoPeca(sc);

			PecaDeXadrez peca_Capturada = partida1.fazerMovimento(origem, posicao_Final);
		}
	}
}
