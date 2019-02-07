package model;

// AJ Abrahamsen

public class GoldenBirthdayFinder {
	
	String month;
	int day;
	int year;
	String goldenBirthday;
	
	public GoldenBirthdayFinder() {
		super();
	}
	
	public GoldenBirthdayFinder(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		setGoldenBirthday(month, day, year);
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGoldenBirthday() {
		return goldenBirthday;
	}

	public void setGoldenBirthday(String month, int day, int year) {
		int goldYear = year + day;
		
		this.goldenBirthday = month + " " + Integer.toString(day) + ", " + Integer.toString(goldYear);
	}

	@Override
	public String toString() {
		return "GoldenBirthdayFinder [goldenBirthday=" + goldenBirthday + "]";
	}

}
