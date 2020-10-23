package assignment_42;

public class DistributionPrint{
	
	private Distribution dis = new Distribution(0,0);
	
	public DistributionPrint(Distribution dis) {
		this.dis = dis;
	}
	
	public void disPrint() {
		for(int i=0; i<dis.getMax()-dis.getMin()+1;i++) {
			System.out.print(dis.getMin()+i + ": ");
			System.out.println(dis.frequency(dis.getMin()+i));
		}
		System.out.println("Average: " + dis.average());
		System.out.println("Count: " + dis.getCount());
	}
	
}
