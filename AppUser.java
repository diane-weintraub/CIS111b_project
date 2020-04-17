/**
 * 
 */
package HowCanIHelp;

/**
 *         Project: How Can I Help? application
 *         Authors: Patrick Moran, Hamsa Nandana Shaik, Diane Weintraub 
 * 
 *   Class purpose: Abstract superclass used to enforce shared variables among its subclasses
 *    Date created: 14 April 2020
 *   Programmer(s): Patrick Moran
 *   
 *        Revision: 14 Apr 2020, Moran, example explanation of what was changed in the code
 *        Revision: N/A
 *        Revision: N/A
 *   
 */
public abstract class AppUser {
	protected String email;
	protected String password;
	protected long IDnumber;
	protected String address;
	protected long phoneNumber;
	
	////////////////////////////////////////////  get Methods  ////////////////////////////////////////////  
	
	/**
	 * The getEmail method returns the user's email.
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * The getPassword method returns the password.
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the iDnumber
	 */
	public long getIDnumber() {
		return IDnumber;
	}
	/**
	 * The getAddress method returns the user's 
	 * address.
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * The getPhoneNumber method returns the user's
	 * phone number.
	 * @return the phone number
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	////////////////////////////////////////////  set Methods  ////////////////////////////////////////////  
	
	/**
	 * The setEmail method allows the user to change 
	 * the email.
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * The setPassword method allow the user to change
	 * the password.
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param iDnumber the iDnumber to set
	 */
	public void setIDnumber(long iDnumber) {
		IDnumber = iDnumber;
	}
	/**
	 * The setAddress method allows the user to set or
	 * change the address.
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * The setPhoneNumber method allows the user
	 * to set or change the phone number.
	 * @param phoneNumber the phone number to set	 
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	////////////////////////////////////////  Additional Methods  /////////////////////////////////////////  
	
	@Override
	public String toString() {
		return "AppUser [email=" + email + ", password=" + password + ", IDnumber=" + IDnumber + 
				", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
