package model;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class GameEngine {
	private ArrayList<Card> cards;
	private Player newPlayer;	
	
	
	
	private Image board = new Image("/Images/board.jpg");
	private Image treasure = new Image("/Images/genericTreasure.jpg");

	private Image classOfRace1 = new Image("/Images/classPictures/cleric.jpg");
	private Image classOfRace2 = new Image("/Images/classPictures/warrior.jpg");
	private Image classOfRace3 = new Image("/Images/classPictures/wizard.jpg");

	private Image curse1 = new Image("/Images/cursePictures/genericCurse.jpg");
	private Image curse2 = new Image("/Images/cursePictures/loseClass.jpg");
	private Image curse3 = new Image("/Images/cursePictures/loseLevel.jpg");
	private Image curse4 = new Image("/Images/cursePictures/loseRace.jpg");

	private Image race1 = new Image("/Images/racePictures/dwarf.jpg");
	private Image race2 = new Image("/Images/racePictures/elf.jpg");
	private Image race3 = new Image("/Images/racePictures/halfling.jpg");

}
