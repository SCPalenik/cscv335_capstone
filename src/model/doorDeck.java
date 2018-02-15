package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class doorDeck {
	private ArrayList<Card> doorDeck;
	private Card card1 = new Card("class", "cleric");
	private Card card2 = new Card("class", "warrior");
	private Card card3 = new Card("class", "wizard");

	private Card card4 = new Card("curse", "genericCurse");
	private Card card5 = new Card("curse", "loseRace_human");
	private Card card5p = new Card("curse", "loseRace_repick");
	private Card card6 = new Card("curse", "loseClass");
	private Card card7 = new Card("curse", "loseLevel");

	private Card card8 = new Card("race", "dwarf");
	private Card card9 = new Card("race", "elf");
	private Card card10 = new Card("race", "halfling");

	private Card cardx = new Card("monster", "monsters");

	private Card cardHelp = new Card("helper", "help");

	public doorDeck() {
		initialRaceCard();
		initialCurseCard();
		initialClassCard();
		initialMonsterCard();
		initialHelpfulCard();
		Collections.shuffle(doorDeck);
	}

	private void initialHelpfulCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			doorDeck.add(cardHelp);
		}
	}

	private void initialMonsterCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			doorDeck.add(cardx);
		}
	}

	private void initialRaceCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			doorDeck.add(card8);
		}
		for (int j = 0; j < 5; j++) {
			doorDeck.add(card9);
		}
		for (int k = 0; k < 5; k++) {
			doorDeck.add(card10);
		}
	}

	private void initialCurseCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			int n = new Random().nextInt(10);
			if (n == 0 || n == 1) {
				doorDeck.add(card4);
			} else if (n == 2) {
				doorDeck.add(card5);
			} else if (n == 3 || n == 4) {
				doorDeck.add(card5p);
			} else if (n == 5 || n == 6) {
				doorDeck.add(card6);
			} else {
				doorDeck.add(card7);
			}
		}
	}

	private void initialClassCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			doorDeck.add(card1);
		}
		for (int j = 0; j < 5; j++) {
			doorDeck.add(card2);
		}
		for (int k = 0; k < 5; k++) {
			doorDeck.add(card3);
		}
	}

}
