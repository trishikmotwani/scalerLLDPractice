package scaler.casestudies.design.tictactoe.strategies;

import scaler.casestudies.design.tictactoe.models.Move;

public interface WinningStrategy {
	
	public boolean checkIfPlayerWon(Move move, int totalPlayers);
}
