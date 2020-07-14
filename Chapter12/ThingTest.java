public class ThingTest {
	public static void main(String[] args) {

		// calling class method is possible even if no objects have been created
		int objectsCreated = Thing.manyThings();

		System.out.print("Thing class has been used to create ");
		System.out.println(objectsCreated + " objects.");

		// create an object which is referred to with the variable ogre
		Thing ogre = new Thing();

		// create 123 objects which cannot be accessed
		for (int i = 1; i <= 123; ++i)
			new Thing();

		// print the number of created objects
		System.out.println("Now an amount of  " + Thing.manyThings() + " objects have been created.");

		// create an object which is referred to with the variable troll
		Thing troll = new Thing();

		// print the Ids of ogre and troll
		System.out.println("ogre: " + ogre.giveId());
		System.out.println("troll: " + troll.giveId());

		objectsCreated = Thing.manyThings();
		System.out.print("Thing class has been used to create ");
		System.out.println(objectsCreated + " objects.");
	}
}