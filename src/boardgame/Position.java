package boardgame;

public class Position {
	private String row;
	private int column;
	
	public Position(String row, int column) {
		this.row = row;
		this.column = column;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
	
}
