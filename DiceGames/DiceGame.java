package DiceGames;

import java.util.Scanner;

public class DiceGame {
	Scanner sc = new Scanner(System.in);
	private Dice d1;
	private Dice d2;
	private Player p1;
	private Player p2;
	String name1;
	String name2;
	
	public Dice getDice() {
		return new Dice();
	}
	
	public void getWinner(Player p1, Player p2) {
		if(p1.getScore()>p2.getScore())
			System.out.println(p1.getName()+" 플레이어가 승리했습니다.");
		else if(p1.getScore()<p2.getScore())
			System.out.println(p2.getName()+" 플레이어가 승리했습니다.");
		else if(p1.bigValue()>p2.bigValue())
			System.out.println(p1.getName()+" 플레이어가 승리했습니다.");
		else if(p1.bigValue()<p2.bigValue())
			System.out.println(p2.getName()+" 플레이어가 승리했습니다.");
		else
			System.out.println("비겼습니다.");
	}
	public void play() {
		System.out.print("첫 번째 플레이어 이름 입력 : ");
		name1 = sc.next();
		System.out.print("두 번째 플레이어 이름 입력 : ");
		name2 = sc.next();
		p1 = new Player(name1);
		p2 = new Player(name2);
		
		p1.play();
		p2.play();
		
		getWinner(p1, p2);
	}

}
