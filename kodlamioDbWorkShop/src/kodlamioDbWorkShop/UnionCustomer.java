package kodlamioDbWorkShop;

public class UnionCustomer extends Customer { // Sendikalar
	private String name;

	public UnionCustomer() {
		super();
	}

	public UnionCustomer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
