package aplicacao;

import tabuleiro.Posicao;
import xadrez.PartidaDeXadrez;

public class Programa {

	public static void main(String[] args) {

		PartidaDeXadrez partida1 = new PartidaDeXadrez();
		UI.imprimirtabuleiro (partida1.pegar_pecas());
	}

}
