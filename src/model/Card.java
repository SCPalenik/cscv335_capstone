package model;

public class Card {
	private String cardType;
	private String cardName;
	private String cardFunction;

	public Card(String cardType, String cardName) {
		this.cardType = cardType;
		this.cardName = cardName;
	}

	public void setCardType(String type) {
		this.cardType = type;
	}

	public void setCardName(String name) {
		this.cardName = name;
	}

	public void setCardFunction(String function) {
		this.cardFunction = function;
	}

	public String getCardFunction() {
		return this.cardFunction;
	}

	public String getCardType() {
		return this.cardType;
	}

	public String getCardName() {
		return this.cardName;
	}
	
}
