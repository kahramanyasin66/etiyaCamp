package kodlamioDbWorkShop;

public class CorporateCustomer extends Customer {
	private String title;
	private String taxNumber;

	public CorporateCustomer() {
		super();
	}

	public CorporateCustomer(String title, String taxNumber) {
		super();
		this.title = title;
		this.taxNumber = taxNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
