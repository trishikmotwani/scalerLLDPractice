package scaler.casestudies.design.tictactoe.models;

import java.util.Scanner;

public class Player {

	private Symbol symbol;
	private String name;
	private PlayerTypes type;
	
	public Move makeMove() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Which Row, Column (Comma Seperated)?");
			String cellIndex = sc.next();
			int row = Integer.parseInt(cellIndex.split(",")[0]);
			int column = Integer.parseInt(cellIndex.split(",")[1]);
			return new Move(row, column, this);
		} catch (Exception e) {
			return null;
		}
		
	}
	public Symbol getSymbol() {
		return symbol;
	}


	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PlayerTypes getType() {
		return type;
	}


	public void setType(PlayerTypes type) {
		this.type = type;
	}


	public static class PlayerBuilder {
		
		public static Player buildHumanPlayer(char symbolIdentifier, String name) {
			Player player = new Player();
			player.setName(name);
			player.setSymbol(new Symbol(symbolIdentifier));
			player.setType(PlayerTypes.Human);
			return player;
		}
		
		public static Player buildBotPlayer(char symbolIdentifier, String name, BotDifficultyLevels difficultyLevel) {
			Bot bot = new Bot();
			bot.setName(name);
			bot.setSymbol(new Symbol(symbolIdentifier));
			bot.setType(PlayerTypes.Bot);
			bot.setDifficultyLevel(difficultyLevel);
			return bot;
		}
	}
}
