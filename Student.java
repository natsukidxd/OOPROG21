
public class Student {

	private int id;
	private String firstName, middleName, lastName, course;
	
	public Student(int id, String firstName, String middleName, String lastName, String course) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return firstName + " " + middleName + " " + lastName;
	}
	

}
