import java.util.ArrayList;
import java.util.Random;

public class MonsterHelper 
{
	Monster newMonster = new Monster();
	Character newCharacter = new Character();
	Treasure treasureCard = new Treasure();
	Random indexGen = new Random();
	
	int charLevel;
	int listIndex;
	int maxVal = 0;
	
	MonsterHelper() //constructor
	{
		
	}
	public int collectTreasure()
	{
		//give player treasure cards, randomized from 1-5
		int mTreasure; 
		newMonster.setGood();
		mTreasure = newMonster.getGood();
		return mTreasure;
	}
	public void collectLoss(ArrayList playerHand)
	{
		int mBadStuff;
		newMonster.setBad();
		mBadStuff = newMonster.getBad();
		switch(mBadStuff)
		{
		case 1:
			System.out.println("You've lost 1 level");
			charLevel = newCharacter.getLevel();
			newCharacter.setLevel(charLevel - 1);
			break;
		case 2: 
			System.out.println("You've lost 2 levels");
			charLevel = newCharacter.getLevel();
			newCharacter.setLevel(charLevel - 2);
			break;
		case 3: 
			System.out.println("You've lost your biggest item");
			for(int i = 0; i < playerHand.size(); i ++)
			{
				//TODO: cycle through playerHand arrayList and find the card of the 
				//biggest value. Remove that card from the player's hand
			}
			playerHand.remove(maxVal);
		case 4: 
			System.out.println("You've lost 2 items");
			for(int i = 0; i < 1; i ++)
			{
				listIndex = indexGen.nextInt(playerHand.size());
				playerHand.remove(listIndex);
			}
		case 5: 
			System.out.println("You've died");
			//TODO: insert code to die.
			//need to end game here. 
		}
	}
	public void levelUp()
	{
		charLevel = newCharacter.getLevel();
		newCharacter.setLevel(charLevel + 1);
		System.out.println("You've gained a level");
	}
	
}
