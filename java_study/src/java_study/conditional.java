package java_study;

import java.util.Scanner;

public class conditional {
	public static void main(String[] args) {
		
		//	if ~ else��
		int arg1 = 20;
		int arg2 = 20;
		
		if(arg1 < arg2) {
			System.out.println("arg1�� arg2���� �۴�.");
		} else if(arg1 > arg2){
			System.out.println("arg1�� arg2���� ũ��.");
		} else {
			System.out.println("arg1�� arg2�� ����.");
		}
		
		// switch��
		System.out.println("������ �Է��ϼ���.");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch(score) {
		case 100:
		case 90:
		System.out.println("��");
		break;
		
		case 80:
		System.out.println("��");
		break;
		
		case 70:
		System.out.println("��");
		break;
		
		default:
		System.out.println("�ٽ� �õ����ּ���.");
		break;
		}
		inputNum.close();
	}
}
