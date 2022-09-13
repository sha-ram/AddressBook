//employee/employer
public class BusinessContacts extends Contact {
	
	private String jobTitle;
    private String organization;
/**
 * 
 * @param firstName
 * @param lastName
 * @param address
 * @param email
 * @param phone
 * @param jobTitle
 * @param organization
 */
	public BusinessContacts(String firstName, String lastName, String address, String email, String phone,String jobTitle, String organization) {
		super(firstName, lastName, address, email, phone);
		// TODO Auto-generated constructor stub
		this.jobTitle = jobTitle;
        this.organization = organization;
	}
	
	public String getJobTitle() {
        return jobTitle;
    }
 
    /**
     * 
     * @param jobTitle
     */
	public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
 
    public String getOrganization() {
        return organization;
    }
 
    public void setOrganization(String organization) {
        this.organization = organization;
    }

}
