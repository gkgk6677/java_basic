package java_study;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// forloop�� �̿��� ������ ���
		
		System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
		Scanner inputNum = new Scanner(System.in);
		int number = inputNum.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n", number, i, number*i);
		}
		inputNum.close();
		System.out.println("--------------------");
		int j = 1;
		while(j<10) {
			System.out.printf("%d * %d = %d\n", number, j, number*j);
			j++;
		}
	}

}