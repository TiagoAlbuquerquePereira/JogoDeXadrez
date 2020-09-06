package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoDeXadrez;
import xadrez.xadrezException;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partida1 = new PartidaDeXadrez();

		while (true) {
			try {

				UI.limparTela();
				UI.imprimirtabuleiro(partida1.pegar_pecas());
				System.out.println();
				System.out.print("Peça que deseja mover: ");
				PosicaoDeXadrez origem = UI.lerPosicaoPeca(sc);

				
				System.out.println();
				System.out.print("Casa para mover a peça: ");
				PosicaoDeXadrez posicao_Final = UI.lerPosicaoPeca(sc);

				PecaDeXadrez peca_Capturada = partida1.fazerMovimento(origem, posicao_Final);
			} catch (xadrezException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}

			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.hasNextLine();
			}

		}
	}
}
