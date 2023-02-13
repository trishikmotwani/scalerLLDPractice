package scaler.casestudies.design.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int dimension;
	private List<ArrayList<Cell>> cells;
	
	
	public Board(int dimension) {
		super();
		this.dimension = dimension;
		
		List<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();
		for(int i = 0;i < dimension; i++) {
			cells.add(new ArrayList<Cell>());
			
			for(int j = 0; j < dimension; j++) {
				cells.get(i).add(new Cell(i, j));
			}
		}
		this.cells = cells;
	}
	
	public Cell getCell(int row, int col) {
		return this.cells.get(row).get(col);
	}
	public void printBoard() {
		for(List<Cell> cellList: this.getCells()) {
			for(Cell cell: cellList) {
				if(cell.getPlayer() == null) {
					System.out.print("- ");
				} else {
					System.out.print(cell.getPlayer().getSymbol().getIdentifier() + " ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public List<ArrayList<Cell>> getCells() {
		return cells;
	}
	public void setCells(List<ArrayList<Cell>> cells) {
		this.cells = cells;
	}
	
}
