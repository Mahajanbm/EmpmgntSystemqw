package tata.demo;

public class Product {
	private int pid;
	private String name;
	private String validity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public Product(int pid, String name, String validity) {
		super();
		this.pid = pid;
		this.name = name;
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", validity=" + validity + "]";
	}


}
