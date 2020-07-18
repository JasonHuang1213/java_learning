public class CharStack {

	private Node topmost;

	// constructor for creating an empty stack
	public CharStack() {
		topmost = null;
	}

	/*
	* addOnTop method
	* adds the Character object received as parameter
	* to be the topmost object in the stack
	* parameter(t): object to add
	* returns: -
	*/
	public void addOnTop(Character newest) {
		// add the first character
		if (topmost == null) {
			topmost = new Node(newest);
		} else { // list has characters already
			Node mostNew = new Node(newest);
			mostNew.setPrevious(topmost);
			topmost = mostNew;
		}
	}

	/*
	* removeFromTop method
	* removes the topmost
	* Character object
	* parameter(t): -
	* returns: removed Character object
	*/
	public Character removeFromTop() {
		// if stack is empty...
		if (topmost == null) {
			return null; // ...return null
		} else { // otherwise...
			Character character = topmost.TypeinCharacter();
			topmost = topmost.TypeinPrevious();
			return character;
		}
	}

	/*
	* toString method
	* toString method inherited from Object class
	* overridden to create a character string presentation
	* of the characters in the stack.
	* parameter(t): -
	* returns: character string of the stack state
	*/
	public String toString() {
		String cs = "[Stack is empty]";
		Node current = topmost;
		if (topmost != null) {
			cs = "";
			while (current.TypeinPrevious() != null) {
				cs += "[" + current.TypeinCharacter() + "]\n";
				current = current.TypeinPrevious();
			}
			// lowest character included
			cs += "[" + current.TypeinCharacter() + "]";
		}
		return cs;
	}
}

class Node {

	private Character character;
	private Node previous;

	public Node(Character character) {
		this.character = character;
		previous = null;
	}

	public Character TypeinCharacter() {
		return character;
	}

	public Node TypeinPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
