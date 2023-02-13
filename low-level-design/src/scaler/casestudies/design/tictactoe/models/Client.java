package scaler.casestudies.design.tictactoe.models;

import java.util.*;

import scaler.casestudies.design.tictactoe.factories.WinningStrategyFactory;
import scaler.casestudies.design.tictactoe.models.Player.PlayerBuilder;
import scaler.casestudies.design.tictactoe.strategies.WinningStrategy;

public class Client {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Players ?");
		int noOfPlayers = sc.nextInt();
		
		System.out.println("How Many Bot Players ?");
		int noOfBots = sc.nextInt();
		
		List<Player> players = new ArrayList<Player>();
		for(int i = 0; i < noOfPlayers; i++) {
			System.out.println("Player " + (i + 1) + " name ?");
			String playerName = sc.next();
			System.out.println("Player " + (i + 1) + " symbol ?");
			char playerSymbol = sc.next().charAt(0);
			players.add(PlayerBuilder.buildHumanPlayer(playerSymbol, playerName));
		}
		
		for(int i = 0; i < noOfBots; i++) {
			System.out.println("Bot Player " + (i + noOfPlayers + 1) + " name ?");
			String botName = sc.next();
			System.out.println("Bot Player " + (i + noOfPlayers + 1) + " symbol ?");
			char botSymbol = sc.next().charAt(0);
			System.out.println("Bot Player " + (i + noOfPlayers + 1) + " difficulty level ?");
			String difficultyLevel = sc.next();
			players.add(PlayerBuilder.buildBotPlayer(botSymbol, botName, Bot.getBotDifficltyLevel(difficultyLevel)));
		}
		
		System.out.println("How Many Winning Strategies ?");
		int noOfWinningStrategies = sc.nextInt();
		
		List<WinningStrategy> winningStrategies = new ArrayList<WinningStrategy>();
		for(int i = 0; i < noOfWinningStrategies; i++) {
			System.out.println("Enter Winning Strategy " + i  + " :");
			String strategy = sc.next();
			winningStrategies.add(WinningStrategyFactory.getWinningStrategy(strategy));
		}
		
		Game tttGame = Game.getBuilder().setPlayers(players).setWinningStrategies(winningStrategies).build();
		
		// start playing the game		
		//if client know how to make a move in the game , 
		// like get the last player index and make the move with row and column(cell) that is wrong,
		// client interface should be minimal like just start the game
		
		tttGame.start();
		// what is mvc -> Client order food -> Waiter -> Chef -> Cold Storage
	}
}
