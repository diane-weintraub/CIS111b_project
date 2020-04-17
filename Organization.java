/**
 * 
 */
package HowCanIHelp;

/**
 * @author dweintraub
 *
 */
public class Organization extends AppUser {

	/**
	 * The Organization class holds the information for an organization that
	 * has registered as a user of the How Can I Help? app.  It inherits from
	 * the AppUser abstract superclass.
	 */
	
	
	//Declare variables
	protected String organizationName;
	protected String contactFirstName;
	protected String contactLastName;
		
		
		/**
		 * The constructor sets the organization's identifying information:  
		 * email of contact, a password, address of organization, phone number 
		 * of contact, name of organization, and name of contact.
		 * <p>
		 * @param email
		 * @param password
		 * @param address
		 * @param phoneNumber
		 * @param organizationName
		 * @param contactFirstName
		 * @param contactLastName
		 */
		
	public Organization(String email, String password, String address, long phoneNumber, String organizationName, 
			String contactFirstName, String contactLastName) {	
	
	// Call the superclass constructor
		super(email, password, address, phoneNumber);
		
	//Set the rest of the fields
		this.organizationName = organizationName;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;	
	}


		/**
		 * The getOrganizationName method returns the name of 
		 * the organization.
		 * @return the organizationName
		 */
		public String getOrganizationName() {
			return organizationName;
		}


		/**
		 * The setOrganizationName method allows the user to 
		 * change the name of the organization.
		 * @param organizationName the organizationName to set
		 */
		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}


		/**
		 * The getContactFirstName method returns the first name
		 * of the organization's contact.
		 * @return the contactFirstName
		 */
		public String getContactFirstName() {
			return contactFirstName;
		}


		/**
		 * The setContactFirstName method allows the user to change
		 * the first name of the organization's contact.
		 * @param contactFirstName the contactFirstName to set
		 */
		public void setContactFirstName(String contactFirstName) {
			this.contactFirstName = contactFirstName;
		}


		/**
		 * The getContactLastName method returns the last name of the
		 * organization's contact.
		 * @return the contactLastName
		 */
		public String getContactLastName() {
			return contactLastName;
		}


		/**
		 * The setContactLastName method allows the user to change
		 * the last name of the organization's contact.
		 * @param contactLastName the contactLastName to set
		 */
		public void setContactLastName(String contactLastName) {
			this.contactLastName = contactLastName;
		}


		@Override
		public String toString() {
			return "Organization [organizationName=" + organizationName + ", contactFirstName=" + contactFirstName
					+ ", contactLastName=" + contactLastName + ", email=" + email + ", password=" + password
					+ ", IDnumber=" + IDnumber + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
		}

	
	
}
