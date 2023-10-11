package DiceGames;

public class Player {
	private int v1;
	private int v2;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void play() {
		DiceGame dg = new DiceGame();
		Dice d1 = dg.getDice();
		Dice d2 = dg.getDice();
		v1 = d1.getValue();
		System.out.println(name + "의 첫 번째 주사위 결과: " + v1);
		v2 = d2.getValue();
		System.out.println(name + "의 두 번째 주사위 결과: " + v2);
	}
	
	public int getScore() {
		return v1+v2;
	}
	public int bigValue() {
		return v1>v2?v1:v2;
	}

}
