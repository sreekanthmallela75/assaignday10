package assaignmentsday10;

public class UC1 {
	public class AddressBook extends UC2 {
	    private static final String Email = null;
		private static final String LastName = null;
		private static final String FirstName = null;
		String address, city, state;
	    int zip;
	    long phoneNo;

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setPhoneNo(long phoneNo) {
	        this.phoneNo = phoneNo;
	    }

	    public long getPhoneNo() {
	        return phoneNo;
	    }

	    public void setZip(int zip) {
	        this.zip = zip;
	    }

	    public int getZip() {
	        return zip;
	    }

		public String getFirstName() {
			// TODO Auto-generated method stub
			return FirstName;
		}

		public String getEmail() {
			// TODO Auto-generated method stub
			return Email;
		}

		public String getlastName() {
			// TODO Auto-generated method stub
			return LastName;
		}
	}
}
