import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MonsterHelper 
{
	Monster newMonster = new Monster();`
	Character newCharacter = new Character();
	Random indexGen = new Random();
	
	int charLevel;
	int listIndex;
	
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
	public class collectLoss(ArrayList playerHand)
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
			Object hand = Collections.max(playerHand);
			hand.remove();			
		case 4: 
			System.out.println("You've lost 2 items");
			for(int i = 0; i < 1; i ++)
			{
				listIndex = indexGen(playerHand.size());
				playerHand.remove(listIndex);
				playerHand.remove();
			}
		case 5: 
			System.out.println("You've died");
			//TODO: insert code to die.
			//need to end game here. 
		}
	}
	public int levelUp()
	{
		charLevel = newCharacter.getLevel();
		newCharacter.setLevel(charLevel + 1);
		System.out.println("You've gained a level");
	}
	
}
