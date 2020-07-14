import testPackage.Something;	// Our self-defined package
								// testPackage is like a folder name which is our package
public class PackageTest {
   public static void main(String[] args) {
      Something thing = new Something();
      thing.work();
   }
}