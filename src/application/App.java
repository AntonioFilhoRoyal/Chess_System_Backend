package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
	 
		while (!chessMatch.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPiece());
				System.out.println();
				UI.printMatch(chessMatch, captured);
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPositon(sc);
				boolean[][] possibleMove = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPiece(), possibleMove);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPositon(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				if (capturedPiece != null) {
					captured.add(capturedPiece);
					
				}
				if (chessMatch.getPromoted() != null) {
					System.out.print("Enter piece for promotion (B/N/R/Q): ");
					String type = sc.nextLine();
					chessMatch.replacePromotedPiece(type);
				}
			} catch (InputMismatchException e) {
				
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
	}

}
