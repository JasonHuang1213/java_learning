
public class SolidPrism extends Prism{

	private String material;
	private double density;
	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public SolidPrism(double h, double w, double d, String m, double dens) {
		super(h, w, d);
		material = m;
		density = dens;
	}

	public double calculateMass() {
		return this.calculateVolumn() * density;
	}
	
	public static void main(String[] args) {
		SolidPrism prism1 = new SolidPrism(10, 20, 10, "steel", 7.7);
		System.out.println("Prism 1's volumn: " + prism1.calculateVolumn() + " cm3");
		System.out.println("Prism 1's mass: " + prism1.calculateMass() + " g");
	}

}
