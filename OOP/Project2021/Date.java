import java.util.*;

// This is the Date class
public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		this.year = input.nextInt();
		System.out.print("Enter the month: ");
		this.month = input.nextInt();
		System.out.print("Enter the day: ");
		this.day = input.nextInt();
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "" + this.year + "." + this.month + "." + this.day;
	}
}
