package homework1;

public class Homework1 {	
	public static class Dice {
		private int score;
		
		public Dice() {
			score = 0;
		}
		
		public void roll() {
			this.score = (int)(Math.random() * 6) + 1;
		}
		
		public int getScore() {
			return this.score;
		}
	}
	
	public static void main(String[] args) {
		Dice[] dice = new Dice[2];
		dice[0] = new Dice();
		dice[1] = new Dice();
		
		// First roll
		dice[0].roll();
		dice[1].roll();
		
		// Roll until two dices have same scores
		while(dice[0].getScore() != dice[1].getScore()) {
			System.out.println("Dice 1: " + dice[0].getScore());
			System.out.println("Dice 2: " + dice[1].getScore());
			dice[0].roll();
			dice[1].roll();
		}
		System.out.println("Dice 1: " + dice[0].getScore());
		System.out.println("Dice 2: " + dice[1].getScore());
	}
}