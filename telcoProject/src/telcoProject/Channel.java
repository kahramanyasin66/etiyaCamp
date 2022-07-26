package telcoProject;

import java.util.List;

public class Channel { // Fatura �deme Kanallar�
	private int id;
	private String name;
	private List<Payment> payments;

	public Channel() {
	}

	public Channel(int id, String name, List<Payment> payments) {
		this.id = id;
		this.name = name;
		this.payments = payments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
