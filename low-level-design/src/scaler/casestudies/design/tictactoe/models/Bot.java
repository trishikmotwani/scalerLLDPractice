package scaler.casestudies.design.tictactoe.models;

import java.util.Scanner;

public class Bot extends Player {

	private BotDifficultyLevels difficultyLevel;
	
	public static BotDifficultyLevels getBotDifficltyLevel(String level) {
		
		if(level.equalsIgnoreCase("easy")) {
			return BotDifficultyLevels.EASY;
		} else {
			return BotDifficultyLevels.MEDIUM;
		}
	}
	
	@Override
	public Move makeMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Comma Seperated Row, Column ?");
		String cellIndex = sc.next();
		int row = Integer.parseInt(cellIndex.split(",")[0]);
		int column = Integer.parseInt(cellIndex.split(",")[1]);
		return new Move(row, column, this);
	}
	/**
	 * @return the difficultyLevel
	 */
	public BotDifficultyLevels getDifficultyLevel() {
		return difficultyLevel;
	}

	/**
	 * @param difficultyLevel the difficultyLevel to set
	 */
	public void setDifficultyLevel(BotDifficultyLevels difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
}
