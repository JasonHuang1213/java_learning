package assignment_61;

public class Rectangle implements Measurable{
		private double lowerLeftX;
		private double lowerLeftY;
		private double upperRightX;
		private double upperRightY;
		
		//Constructor with no parameters
		public Rectangle() {
			super();
			lowerLeftX = 0;
			lowerLeftY = 0;
			upperRightX = 1;
			upperRightY = 1;
		}
		
		//Constructor with two parameters
		public Rectangle(double upperRightX, double upperRightY) {
			super();
			lowerLeftX = 0;
			lowerLeftY = 0;
			this.upperRightX = upperRightX;
			this.upperRightY = upperRightY;
		}
		
		//Constructor with four parameters
		public Rectangle(double lowerLeftX, double lowerLeftY, double upperRightX, double upperRightY) {
			super();
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
		
		@Override
		public double area() {
			return (upperRightY - lowerLeftY)*(upperRightX - lowerLeftX);
		}

		@Override
		public double perimeter() {
			return 2*(upperRightX - lowerLeftX + upperRightY - lowerLeftX);
		}

		@Override
		public void scale(double scaleValue) {
			upperRightX = lowerLeftX + scaleValue * (upperRightX - lowerLeftX);
			upperRightY = lowerLeftY + scaleValue * (upperRightY - lowerLeftY);
		}
	}