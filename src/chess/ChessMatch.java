package chess;

import boardgame.Board;
import boardgame.Position;
import chess.piece.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); // IMPRIMINDO TABULEIRO
		initialSetup(); // IMPRIMINDO A PEÇA
	}
	
	// REGRA DE IMPRESSÃO DA PEÇA, IMPRIMINDO DE ACORDO COM A LINHA E COLUNA
	public ChessPiece[][] getPiece(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	// METODO PARA COLOCA A PEÇA NO TABULEIRO
	private void initialSetup() {
		// TABULEIRO, PEÇA, POSIÇÃO
		board.placePiece(new Rook(board, Color.WHITE), new Position(1, 1));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
	}
	
}
