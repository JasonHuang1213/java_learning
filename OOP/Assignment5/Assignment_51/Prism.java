public class Prism {
	private double height;
	private double width;
	private double depth;
	
	// Constructor
	public Prism(double h,double w,double d) {
		height = h;
		width = w;
		depth = d;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double calculateVolumn() {
		return height*width*depth;
	}
}