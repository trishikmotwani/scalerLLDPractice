package scaler.casestudies.design.tictactoe.strategies;

import java.util.HashMap;

import scaler.casestudies.design.tictactoe.models.Move;

public class VerticalWinningStrategy implements WinningStrategy {

	public HashMap<Integer, HashMap<Character, Integer>> columnSymbolCountMap = new HashMap<Integer, HashMap<Character, Integer>>();
	
	@Override
	public boolean checkIfPlayerWon(Move move, int totalPlayers) {
		char playerSymbol = move.getPlayer().getSymbol().getIdentifier();
		int columnNumber = move.getColumn();
		
		if(columnSymbolCountMap.get(columnNumber) == null) {
			// when for row, first time a symbol was added
			HashMap<Character, Integer> symbolCountMap = new HashMap<Character, Integer>();
			symbolCountMap.put(playerSymbol, 1);
			columnSymbolCountMap.put(columnNumber, symbolCountMap);
		} else {
			HashMap<Character, Integer> symbolCountMap = columnSymbolCountMap.get(columnNumber);
			if(symbolCountMap.get(playerSymbol) == null) {
				symbolCountMap.put(playerSymbol, 1);
			} else {
				symbolCountMap.put(playerSymbol, symbolCountMap.get(playerSymbol) + 1);
			}
			if(symbolCountMap.get(playerSymbol) == totalPlayers + 1) {
				return true;
			}
		}
		return false;
	}

}
