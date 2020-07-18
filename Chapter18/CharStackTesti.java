public class CharStackTesti {
	public static void main(String[] args) {
		CharStack mp = new CharStack();
		System.out.println("STACK:\n" + mp);

		mp.addOnTop(new Character('A'));
		mp.addOnTop(new Character('B'));
		mp.addOnTop(new Character('C'));
		System.out.println("STACK:\n" + mp);

		mp.addOnTop(new Character('D'));
		mp.addOnTop(new Character('E'));
		System.out.println("STACK:\n" + mp);

		System.out.println("Remove from top: " + mp.removeFromTop());
		System.out.println("Remove from top: " + mp.removeFromTop());
		System.out.println("STACK:\n" + mp);

		System.out.println("Remove rest of the characters...");
		while (mp.removeFromTop() != null) {} // remove the rest
		System.out.println("STACK:\n" + mp);
	}
}