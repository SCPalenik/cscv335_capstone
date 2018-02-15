package model;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	private int level;
	private boolean alive;
	private ArrayList<Card> cardList;
	private ArrayList<Item> itemList;
	private winGoal rule;
	private int goldPieces;
	private boolean fightMoster;
	private String raceBelong;
	private String classBelong;
	private int bonuses;

	public Player() {
		level = 0;
		bonuses=0;
		alive = true;
		cardList = new ArrayList<Card>();
		itemList = new ArrayList<Item>();
		goldPieces = 0;
		fightMoster = false;
		raceBelong = null;
		classBelong =null;
	}
	
	public void addBonuses(int newBonuses) {
		bonuses+=newBonuses;
	}
	
	public int getBonuses() {
		return bonuses;
	}
	// a serail function handle the items.
	public void initialItem(ArrayList<Item> newArrayItem) {
		for(int i=0;i<newArrayItem.size();i++) {
			itemList.add(newArrayItem.get(i));
		}
	}

	public void addItem(Item e) {
		itemList.add(e);
	}

	public ArrayList<Item> getItem() {
		return itemList;
	}
	// a serail function handle the card.
	public void initialCard(ArrayList<Card> newArrayCard) {
		for(int i=0;i<newArrayCard.size();i++) {
			cardList.add(newArrayCard.get(i));
		}
	}

	public void addCard(Card e) {
		cardList.add(e);
	}

	public ArrayList<Card> getCard() {
		return cardList;
	}

	// initialRace, from "dwarf", "elf", "halflign".
	public String initialRace() {
		String[] race = { "dwarf", "elf", "halflign" };
		int n = new Random().nextInt(3);// random select one race from 0-2.
		return race[n];
	}

	public String getRace() {
		return raceBelong;
	}

	public void setRace(String newRace) {
		raceBelong = newRace;
	}
	
	// initialClass, from "cleric", "warrior", "wizard".
	public String initialClassBelong() {
		String[] classBelong = { "cleric", "warrior", "wizard" };
		int n = new Random().nextInt(3);// random select one race from 0-2.
		return classBelong[n];
	}

	public String getClassBelong() {
		return classBelong;
	}

	public void setClassBelong(String newClass) {
		classBelong = newClass;
	}

	// temporay methods for fight with moster.
	public boolean isFightMoster() {
		fightMoster = true;
		return fightMoster;
	}

	public boolean winMoster() {
		fightMoster = false;
		level += 1;
		return fightMoster;
	}

	// a serail function handle the gold
	public void addGoldPieces(int moneyGet) {
		goldPieces += moneyGet;
	}

	public void spendGoldPieces(int moneyToken) {
		goldPieces -= moneyToken;
	}

	public int getGoldPieces() {
		return goldPieces;
	}

	// a serail function about the level
	public void setLevel() {
		level += 1;
	}

	public int getLevel() {
		return level;
	}

	// a serail function about player game status
	public boolean isDead() {
		alive = false;
		return alive;
	}

	public boolean isLive() {
		return alive;
	}

	public String getWinStatus() {
		if (rule.checkWin(this)) {
			return "Congraduation, you win";
		} else {
			return "Unfortunely, you lost in this game";
		}
	}

}
