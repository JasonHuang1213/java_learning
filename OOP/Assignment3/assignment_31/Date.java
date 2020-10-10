package assignment_31;

public class Date {
	private int day;
	private int month;
	private int year;
	public static final String[] MONTHNAMES = {"January", "February",
			"March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December"};
	
	//Constructor without parameters (initializing with today)
	public Date() {
		java.time.LocalDate today = java.time.LocalDate.now();
		day = today.getDayOfMonth();
		month = today.getMonthValue();
		year = today.getYear();
	}
	
	//Constructor with three parameters
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//Constructor taking a string
	public Date(String date) {
		// split date string by dot "." and change the string into integer
		this.day = Integer.parseInt(date.split("\\.")[0]);
		this.month = Integer.parseInt(date.split("\\.")[1]);
		this.year = Integer.parseInt(date.split("\\.")[2]);
	}
	
	// method checking if two Dates are same
	public boolean isSame(Date another) {
		if(this.day == another.day && this.month == another.month && this.year == another.year)
			return true;
		else
			return false;	
	}
	
	
	//Getters and setters
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "" + day + '.' + month + '.' + year;
	}
	
	// Method to convert dd.mm.yyyy into long date format
	public String longForm() {
		String d = "";
		String m = "";
					
		//Convert day number into standard format
		if(this.day == 1 || this.day == 11 || this.day == 21 || this.day == 31)
			d = Integer.toString(this.day) + "st";
		else if(this.day == 2 || this.day == 12 || this.day == 22)
			d = Integer.toString(this.day) + "nd";
		else if(this.day == 3 || this.day == 13 || this.day == 23)
			d = Integer.toString(this.day) + "rd";
		else
			d = Integer.toString(this.day) + "th";
		
		//Convert month number into month names
		m = MONTHNAMES[this.month-1];
		
		return "the " + d + " of " + m + ", " + Integer.toString(this.year);
	}
	
	public static int monthName(String month) {
		int index = -1;
		for(int i=0; i<12; i++) {
			// better way than MONTHNAMES[i].toUpperCase().equals(month.toUpperCase())
			if(MONTHNAMES[i].equalsIgnoreCase(month)) {
				index = i+1;
				break;
			}
		}
		return index;
	}
}