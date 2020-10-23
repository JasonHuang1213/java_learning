package assignment_42;

public class Dice {
	private int score;

	public Dice() {
		score = 0;
	}

	public void roll() {
		this.score = (int) (Math.random() * 6) + 1;
	}

	public int getScore() {
		return this.score;
	}
}