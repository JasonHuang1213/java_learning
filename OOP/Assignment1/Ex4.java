package exercise;

public class Ex4 {
	
	public static class Prism {
		private double height;
		private double width;
		private double depth;
		
		// Constructor
		public Prism(double h,double w,double d) {
			height = h;
			width = w;
			depth = d;
		}
		
		public double returnVolumn() {
			return height*width*depth;
		}
	}
	
	public static class Driver {
		public void instantPrism() {
			Prism obj1 = new Prism(2.0,2.0,2.0);
			Prism obj2 = new Prism(3.0,3.0,3.0);
			System.out.println("Dimensions in prism 1: ");
			System.out.println(obj1.height);
			System.out.println(obj1.width);
			System.out.println(obj1.depth);
			System.out.println("Prism 1 volumn: ");
			System.out.println(obj1.returnVolumn() + "\n");
			
			System.out.println("Dimensions in prism 2: ");
			System.out.println(obj2.height);
			System.out.println(obj2.width);
			System.out.println(obj2.depth);
			System.out.println("Prism 2 volumn: ");
			System.out.println(obj2.returnVolumn());
		}
	}
	
	public static void main(String[] args) {
		Driver obj1 = new Driver();
		obj1.instantPrism();
	}
}