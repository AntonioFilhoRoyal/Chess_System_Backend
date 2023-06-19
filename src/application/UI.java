package application;

import chess.ChessPiece;

public class UI {
	
	// IMPRIMINDO TABULEIRO
	public static void printBoard(ChessPiece[][] pieces) {
		
		// FAZENDO UMA MATRIZ DE 8X8 PRA IMPRESSAO DAS LIHNAS[]COLUNAS[]
		for(int i = 0; i < pieces.length; i++) {
			// COLUNAS DE 8 A 1
			System.out.print((8 - i) + " ");
			for(int j = 0; j < pieces.length; j++) {
				// POSIÇÃO DA PEÇA
				printPiece(pieces[i][j]);
			}
			
			System.out.println();
		}
		// LINHAS DE A ATE H
		System.out.println("  a b c d e f g h");
	}
	
	// IMPRIMINDO PEÇA
	private static void printPiece(ChessPiece piece) {
		// CASO A POSIÇÃO PASSADA NÃO TIVE PEÇA, SERA IMPRESSO "-"
		if(piece == null) {
			System.out.print("-");
		} else {
			// SE HOUVE PEÇA, A PEÇA SERA IMPRIMIDA
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
