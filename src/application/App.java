package application;

import chess.ChessMatch;

public class App {

	public static void main(String[] args) {
		
		// CLASS DE REGRAS DO XADREZ, TUDO OQUE FOR REGRAS E JOGO ESTARA AQUI
		ChessMatch chessMatch = new ChessMatch();
		// CLASS DE IMPRESSÃO DA TABELA
		UI.printBoard(chessMatch.getPiece());
	}

}
