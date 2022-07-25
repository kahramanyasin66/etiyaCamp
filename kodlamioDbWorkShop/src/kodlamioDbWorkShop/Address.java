package kodlamioDbWorkShop;

public class Address {
	private int id;
	private String address;
	private Customer customerId;

	public Address() {
	}

	public Address(int id, String address, Customer customerId) {
		super();
		this.id = id;
		this.address = address;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

}
