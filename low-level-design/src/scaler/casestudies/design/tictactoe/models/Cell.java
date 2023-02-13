package scaler.casestudies.design.tictactoe.models;

public class Cell {

	private int row;
	private int column;
	private Player player;
	
	Cell(int row, int column) {
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
	
}
