package DiceGames;

import java.util.Random;

public class Dice {
	private int value;
	
	public void roll() {
		Random random = new Random();
		value = random.nextInt(5)+1;
	}
	
	public int getValue() {
		roll();
		return value;
	}
	

}
