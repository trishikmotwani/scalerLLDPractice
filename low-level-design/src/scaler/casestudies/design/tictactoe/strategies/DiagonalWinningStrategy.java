package scaler.casestudies.design.tictactoe.strategies;

import java.util.HashMap;

import scaler.casestudies.design.tictactoe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy {

	public HashMap<Character, Integer> diagonalSymbolCountMap = new HashMap<Character, Integer>();
	public HashMap<Character, Integer> antiDiagonalSymbolCountMap = new HashMap<Character, Integer>();
	
	@Override
	public boolean checkIfPlayerWon(Move move, int totalPlayers) {
		char playerSymbol = move.getPlayer().getSymbol().getIdentifier();
		
		if(move.getRow() == move.getColumn()) {
			
			if(diagonalSymbolCountMap.get(playerSymbol) == null) {
				diagonalSymbolCountMap.put(playerSymbol, 1);
			} else {
				diagonalSymbolCountMap.put(playerSymbol, diagonalSymbolCountMap.get(playerSymbol) + 1);
			}
			if(diagonalSymbolCountMap.get(playerSymbol) == totalPlayers + 1) {
				return true;
			}
		}
		if (move.getRow() + move.getColumn() == totalPlayers) { // totalPlayers = boardSize - 1
			if(antiDiagonalSymbolCountMap.get(playerSymbol) == null) {
				antiDiagonalSymbolCountMap.put(playerSymbol, 1);
			} else {
				antiDiagonalSymbolCountMap.put(playerSymbol, antiDiagonalSymbolCountMap.get(playerSymbol) + 1);
			}
			if(antiDiagonalSymbolCountMap.get(playerSymbol) == totalPlayers + 1) {
				return true;
			}
		}
		return false;
	}
}
