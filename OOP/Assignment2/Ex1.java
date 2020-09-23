package assignment2;

public class Ex1 {
	public static void main(String[] args) {
		Rectangle rect1, rect2, rect3;
		rect1 = new Rectangle();
		rect2 = new Rectangle(4,5);
		rect3 = new Rectangle(2,3,5,6);
		
		System.out.println("Three rectangles rect1, rect2 and rect3: ");
		System.out.println("rect1:");
		System.out.println("Height: "+rect1.height());
		System.out.println("Width: "+rect1.width());
		System.out.println("Area: "+rect1.area());
		System.out.println("rect2:");
		System.out.println("Height: "+rect2.height());
		System.out.println("Width: "+rect2.width());
		System.out.println("Area: "+rect2.area());
		System.out.println("rect3:");
		System.out.println("Height: "+rect3.height());
		System.out.println("Width: "+rect3.width());
		System.out.println("Area: "+rect3.area());
	}
	
	public static class Rectangle {
		private double lowerLeftX;
		private double lowerLeftY;
		private double upperRightX;
		private double upperRightY;
		
		//Constructor with no parameters
		public Rectangle() {
			lowerLeftX = 0;
			lowerLeftY = 0;
			upperRightX = 1;
			upperRightY = 1;
		}
		
		//Constructor with two parameters
		public Rectangle(double upperRightX, double upperRightY) {
			lowerLeftX = 0;
			lowerLeftY = 0;
			this.upperRightX = upperRightX;
			this.upperRightY = upperRightY;
		}
		
		//Constructor with four parameters
		public Rectangle(double lowerLeftX, double lowerLeftY, double upperRightX, double upperRightY) {
			this.lowerLeftX = lowerLeftX;
			this.lowerLeftY = lowerLeftY;
			this.upperRightX = upperRightX;
			this.upperRightY = upperRightY;
		}
		
		public double height() {
			return (upperRightY - lowerLeftY);
		}
		
		public double width() {
			return (upperRightX - lowerLeftX);
		}
		
		public double area() {
			return (upperRightY - lowerLeftY)*(upperRightX - lowerLeftX);
		}
	}
	
}