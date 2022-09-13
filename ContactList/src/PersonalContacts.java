
public class PersonalContacts extends Contact {
	
	private String DateOfBirth;

	public PersonalContacts(String firstName, String lastName, String address, String email, String phone, String DOB) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
		this.DateOfBirth = DOB;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

}
