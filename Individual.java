/**
 * 
 */
package HowCanIHelp;

/**
 * @author dweintraub
 *
 */
public class Individual extends AppUser {

	/**
	 * The Individual class holds the information for an individual that
	 * has registered as a user of the How Can I Help? app.  It inherits from
	 * the AppUser abstract superclass.
	 */
		
		//Declare variables
		protected String firstName;
		protected String lastName;
			
		/**
		* The constructor sets the individual's identifying information:  
		* email, a password, address, phone number, and name.
		* <p>
		* @param email
		* @param password
		* @param address
		* @param phoneNumber
		* @param firstName
		* @param lastName
		*/
			
		public Individual(String email, String password, String address, long phoneNumber, 
				String firstName, String lastName) {	
		
		// Call the superclass constructor
			super(email, password, address, phoneNumber);
			
		//Set the rest of the fields
			this.firstName = firstName;
			this.lastName = lastName;	
		}
		
		/**
		 * The getFirstName method returns the user's
		 * first name.
		 * @return the first name
		*/
			public String getFirstName() {
				return firstName;
			}

		/**
		* The setFirstName method allows the user to set
		* or change the first name.
		* @param firstName the first name to set
		*/
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

		/**
		* The getLastName method returns the user's last
		* name.
		* @return the lastName
		*/
			public String getLastName() {
				return lastName;
			}

		/**
		* The setLastName method allows the user to set 
		* or change the last name.
		* @param lastName the last name to set
		*/
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

		@Override
		public String toString() {
			return "Individual [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
					+ password + ", IDnumber=" + IDnumber + ", address=" + address + ", phoneNumber=" + phoneNumber
					+ "]";
		}

}
