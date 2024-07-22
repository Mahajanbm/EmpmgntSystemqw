package tata.demo.data;

public class Address {
	private int flatno;
	
	private String city;
	private String state;
	private String country;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}

	
}
