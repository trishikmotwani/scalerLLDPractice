package scaler.casestudies.design.tictactoe.factories;

import scaler.casestudies.design.tictactoe.strategies.DiagonalWinningStrategy;
import scaler.casestudies.design.tictactoe.strategies.HorizontalWinningStrategy;
import scaler.casestudies.design.tictactoe.strategies.VerticalWinningStrategy;
import scaler.casestudies.design.tictactoe.strategies.WinningStrategy;

public class WinningStrategyFactory {

	public static WinningStrategy getWinningStrategy(String strategy) {
		
		if(strategy.equalsIgnoreCase("vertical")) {
			return new VerticalWinningStrategy();
		} if(strategy.equalsIgnoreCase("horizontal")) {
			return new HorizontalWinningStrategy();
		} if(strategy.equalsIgnoreCase("diagonal")) {
			return new DiagonalWinningStrategy();
		} else {
			throw new Error(strategy + " Winning Strategy does not exist, try again. Available strategies: vertical, horizontal, diagonal");
		}
	}
}
