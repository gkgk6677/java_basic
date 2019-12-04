package inheritance;

public class GOLDCustomer extends Customer {
//	protected int customerID;
//	protected String customerName;
//	protected String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	int newprice;
	double salesRatio;
	
	public GOLDCustomer() {
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.salesRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		
		newprice = (int)(price - price*salesRatio);
		this.bonusPoint += price*bonusRatio;
		
		System.out.println(customerName + "님은 GOLD등급이어서 " + price+"원을 "+ newprice + "원에 구입했습니다. 적립된 포인트는 "+ bonusPoint+"입니다." );
		return newprice;
	}
	
}
