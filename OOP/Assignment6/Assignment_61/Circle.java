package assignment_61;

public class Circle implements Measurable{

    private double cx = 0; // centre x
    private double cy = 0; // centre y
    private double r = 1; // radius

    public Circle(double cx, double cy, double r) {
		super();
		this.cx = cx;
		this.cy = cy;
		this.r = r;
	}

	public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
    
    @Override
    public double perimeter() {
    	return 2 * Math.PI * r;
    }
    
    @Override
    public void scale(double scaleValue) {
    	r = r * scaleValue;
    }
}