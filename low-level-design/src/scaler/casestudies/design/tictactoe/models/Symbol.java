package scaler.casestudies.design.tictactoe.models;

public class Symbol {

	public Symbol(char identifier) {
		super();
		this.identifier = identifier;
	}
	private char identifier;
	private String color;
	/**
	 * @return the identifier
	 */
	public char getIdentifier() {
		return identifier;
	}
	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(char identifier) {
		this.identifier = identifier;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
}
