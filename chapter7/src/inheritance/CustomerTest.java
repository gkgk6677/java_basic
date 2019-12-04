package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		GOLDCustomer customerSeo = new GOLDCustomer();
		customerSeo.customerName = "¼­µ¿±Ç";
		customerSeo.customerID = 10023;
		customerSeo.bonusPoint = 10000;
		String msg = customerSeo.showCustomerInfo();
		System.out.println(msg);
		
		customerSeo.calcPrice(10000);
	}

}
