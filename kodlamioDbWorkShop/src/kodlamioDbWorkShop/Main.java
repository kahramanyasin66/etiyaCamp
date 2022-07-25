package kodlamioDbWorkShop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Canal canal = new Canal(1,"internet");
	    Customer customer = (IndividualCustomer) new IndividualCustomer(1,"2312112",canal,"Yasin","Kahraman","2131321312");
	    System.out.println(customer.getId());
	    System.out.println(customer.getCanal().getName());
	    System.out.println(customer.getCustomerNumber());
	    
	    CommercialActivity commercialActivity = new CommercialActivity((IndividualCustomer)customer,LocalDate.parse("2022-07-25"));
	    System.out.println(((IndividualCustomer)customer).getFirstName());

	}

}
