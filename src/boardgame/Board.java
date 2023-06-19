package boardgame;

public class Board {
	private int rows; // LINHAS
	private int columns; // COLUNAS
	private Piece[][] pieces; // PEÇAS
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Postion on the board not exists");
		}
		return pieces[row][column];
	}
	
	// POSIÇÃO DA PEÇA
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Postion on the board not exists");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Postion on the board not exists");
		}
		return piece(position) != null;
	}
	
}
