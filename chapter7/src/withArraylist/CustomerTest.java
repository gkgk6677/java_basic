package withArraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10001, "�̿���");
		Customer customerKim = new Customer(10002, "���ȣ");
		Customer customerPark = new GOLDCustomer(10003, "�ڹ���");
		Customer customerSeo = new GOLDCustomer(10004, "������");
		Customer customerEo = new VIPCustomer(10005, "���", 2001);
		
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
			System.out.println(customer.getCustomerName()+"���� "+price+"�� ¥���� "+newPrice + "���� �����߽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ������ ���ʽ� ����Ʈ�� " + customer.bonusPoint+"�Դϴ�.");
		}
		
	}

}