// LockBox is a subclass to Box
public class LockBox extends Box {

	// instance variable/existing-content//existing-content////////
	private boolean isLocked;

	// constructo/existing-content//existing-content//existing-content/////
	public LockBox(String s) {
		super(s); // superclass constructor call
		isLocked = true;
	}

	// method/existing-content//existing-content//existing-content//existing-content/
	public void openLock() { // specializing method
		isLocked = false;
	}

	public void openLid() { // overriding method(same name, type and paramters)
		if (this.isLocked) {
			System.out.println("Lock must be opened first!");
		} else {
			super.openLid();
		}
	}
}