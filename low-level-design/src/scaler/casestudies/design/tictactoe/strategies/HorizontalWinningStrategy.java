package scaler.casestudies.design.tictactoe.strategies;

import java.util.HashMap;

import scaler.casestudies.design.tictactoe.models.Move;

public class HorizontalWinningStrategy implements WinningStrategy {

	public HashMap<Integer, HashMap<Character, Integer>> rowSymbolCountMap = new HashMap<Integer, HashMap<Character, Integer>>();
	
	public boolean checkIfPlayerWon(Move move, int totalPlayers) {
		char playerSymbol = move.getPlayer().getSymbol().getIdentifier();
		int rowNumber = move.getRow();
		
		if(rowSymbolCountMap.get(rowNumber) == null) {
			// when for row, first time a symbol was added
			HashMap<Character, Integer> symbolCountMap = new HashMap<Character, Integer>();
			symbolCountMap.put(playerSymbol, 1);
			rowSymbolCountMap.put(rowNumber, symbolCountMap);
		} else {
			HashMap<Character, Integer> symbolCountMap = rowSymbolCountMap.get(rowNumber);
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
