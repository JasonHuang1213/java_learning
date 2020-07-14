public class Boxes {
	public static void main(String[] args) {
		Box BoxA = new Box("sand");
		LockBox BoxB = new LockBox("rocks");

		System.out.println("Box A:");
		BoxA.tellContents();
		BoxA.openLid();
		BoxA.openLid();
		BoxA.tellContents();
		System.out.println();
		System.out.println("Box B: ");
		BoxB.tellContents();
		BoxB.openLid();
		BoxB.openLock();
		BoxB.openLid();
		BoxB.tellContents();
	}
}