public class Box {

	// instance variable/existing-content//existing-content////////
	private boolean lidOpen;
	private String contents;

	// constructo/existing-content//existing-content//existing-content/////
	public Box(String s) {
		lidOpen = false;
		contents = s;
	}

	// instance variable/existing-content//existing-content//existing-content/
	public void openLid() {
		if (lidOpen) {
			System.out.println("Lid was already open!");
		} else {
			lidOpen = true;
			System.out.println("Lid opened.");
		}
	}

	public void tellContents() {
		String lClosed = "Lid is closed, contents unknown!";
		String lOpen = "Box contents: " + contents;
		if (lidOpen) {
			System.out.println(lOpen);
		} else {
			System.out.println(lClosed);
		}
	}
}