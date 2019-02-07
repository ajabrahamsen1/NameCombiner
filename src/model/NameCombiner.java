package model;

// AJ Abrahamsen

public class NameCombiner {
	
	private String firstName;
	private String lastName;
	private String fullName;

	public NameCombiner() {
		super();
	}
	
	public NameCombiner(String fName, String lName) {
		super();
		this.firstName = fName;
		this.lastName = lName;
		setFullName(fName, lName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fName, String lName) {
		this.fullName = fName.toUpperCase() + " " + lName.toUpperCase();
	}

	@Override
	public String toString() {
		return "NameCombiner [fullName=" + fullName + "]";
	}
	
	
}
