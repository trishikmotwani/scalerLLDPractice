package scaler.casestudies.design.tictactoe.factories;

import scaler.casestudies.design.tictactoe.models.BotDifficultyLevels;
import scaler.casestudies.design.tictactoe.strategies.BotPlayingStrategy;
import scaler.casestudies.design.tictactoe.strategies.EasyPlayingStrategy;
import scaler.casestudies.design.tictactoe.strategies.WinningStrategy;

public class BotPlayingStrategyFactory {

	public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevels difficultyLevel) {
		
		if(difficultyLevel == BotDifficultyLevels.EASY) {
			return new EasyPlayingStrategy();
		} else {
			return new EasyPlayingStrategy();
		}
	}
}
