package scaler.casestudies.design.tictactoe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import scaler.casestudies.design.tictactoe.strategies.WinningStrategy;

public class Game {

	private Board board;
	private List<Player> players;
	private List<Move> moves;
	private List<WinningStrategy> winningStrategies;
	private GameStatus status;
	private Player winner;
	private int lastMovedPlayerIndex;
	// Game is Basically a Controller/Waiter in case of hotel example
	private Game() {
		
	}
	public void start() {
		while(this.getStatus() == GameStatus.InProgress) {
			Move move = this.makeMove();
			if(move == null) {
				System.out.println("Bad Move, try again!");
			} else {
				if(this.checkIfPlayerWon(move, this.players.size())) {
					this.status = GameStatus.Finish;
					this.winner = move.getPlayer();
				}
			}	
		}
		if(this.winner != null) {
			this.board.printBoard();
			System.out.println("Congratulations to the winner !!!! " + this.winner.getName() + " * * * hip hip hurray *  * * * ");
			System.out.println(" * * * GAME      ENDED *  * * * ");
		}
	}
	
	public Move makeMove() {
		// prints the board status
		System.out.println();
		this.board.printBoard();
		this.lastMovedPlayerIndex += 1;
		this.lastMovedPlayerIndex %= players.size();
		Player player = this.players.get(this.lastMovedPlayerIndex);
		System.out.print(player.getName().toUpperCase() + "'s Turn: ");
		
		Move potentialMove = player.makeMove();
		if(potentialMove == null || this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).getPlayer() != null) {
			this.lastMovedPlayerIndex -= 1;
			return null;
		}
		
		this.moves.add(potentialMove);
		this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).setPlayer(player);
		return potentialMove;
	}
	
	public boolean checkIfPlayerWon(Move move, int totalPlayers) {
		
		for(WinningStrategy winningStrategy: this.winningStrategies) {
			
			if(winningStrategy.checkIfPlayerWon(move, totalPlayers)) {
				return true;
			}
		}
		
		return false;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public List<Move> getMoves() {
		return moves;
	}
	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}
	
	public GameStatus getStatus() {
		return status;
	}
	public void setStatus(GameStatus status) {
		this.status = status;
	}
	public Player getWinner() {
		return winner;
	}
	public void setWinner(Player winner) {
		this.winner = winner;
	}
	public int getLastMovedPlayerIndex() {
		return lastMovedPlayerIndex;
	}
	public void setLastMovedPlayerIndex(int lastMovedPlayerIndex) {
		this.lastMovedPlayerIndex = lastMovedPlayerIndex;
	}
	
	public static Builder getBuilder() { 
		return new Builder();
	}
	
	/**
	 * @return the winningStrategies
	 */
	public List<WinningStrategy> getWinningStrategies() {
		return winningStrategies;
	}
	/**
	 * @param winningStrategies the winningStrategies to set
	 */
	public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
		this.winningStrategies = winningStrategies;
	}

	public static class Builder {
		private List<Player> players;
		private List<WinningStrategy> winningStrategies;
		
		public Game build() {
			// validate if any symbol is repeating
			HashSet<Character> availableSymbolsSet = new HashSet<Character>();
			for(Player player : this.players) {
				char playerSymbol = player.getSymbol().getIdentifier();
				if(availableSymbolsSet.contains(playerSymbol)) {
					throw new Error("Symbol Already Used, Try Other Symbol - ");
				}
				availableSymbolsSet.add(playerSymbol);
			}
			Game game = new Game();
			game.setPlayers(this.players);
			game.setWinningStrategies(this.winningStrategies);
			game.setLastMovedPlayerIndex(-1);
			game.setStatus(GameStatus.InProgress);
			game.setBoard(new Board(this.players.size() + 1));
			game.setMoves(new ArrayList<Move>());
			return game;
		}
		/**
		 * @return the players
		 */
		public List<Player> getPlayers() {
			return players;
		}
		/**
		 * @param players the players to set
		 */
		public Builder setPlayers(List<Player> players) {
			this.players = players;
			return this;
		}
		/**
		 * @return the winningStrategies
		 */
		public List<WinningStrategy> getWinningStrategies() {
			return winningStrategies;
		}
		/**
		 * @param winningStrategies the winningStrategies to set
		 */
		public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
			this.winningStrategies = winningStrategies;
			return this;
		}
		
		
	}
}
