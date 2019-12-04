package withArraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10001, "이영숙");
		Customer customerKim = new Customer(10002, "김경호");
		Customer customerPark = new GOLDCustomer(10003, "박미현");
		Customer customerSeo = new GOLDCustomer(10004, "서동권");
		Customer customerEo = new VIPCustomer(10005, "어무해", 2001);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerPark);
		customerList.add(customerSeo);
		customerList.add(customerEo);
		
		for(Customer customer : customerList) {
			String msg = customer.showCustomerInfo();
			System.out.println(msg);
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int newPrice = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님은 "+price+"원 짜리를 "+newPrice + "원에 구매했습니다.");
			System.out.println(customer.getCustomerName()+"님의 적립된 보너스 포인트는 " + customer.bonusPoint+"입니다.");
		}
		
	}

}
