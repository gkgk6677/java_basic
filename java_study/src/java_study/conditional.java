package java_study;

import java.util.Scanner;

public class conditional {
	public static void main(String[] args) {
		
		//	if ~ else문
		int arg1 = 20;
		int arg2 = 20;
		
		if(arg1 < arg2) {
			System.out.println("arg1은 arg2보다 작다.");
		} else if(arg1 > arg2){
			System.out.println("arg1은 arg2보다 크다.");
		} else {
			System.out.println("arg1와 arg2는 같다.");
		}
		
		// switch문
		System.out.println("점수를 입력하세요.");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch(score) {
		case 100:
		case 90:
		System.out.println("수");
		break;
		
		case 80:
		System.out.println("우");
		break;
		
		case 70:
		System.out.println("미");
		break;
		
		default:
		System.out.println("다시 시도해주세요.");
		break;
		}
		inputNum.close();
	}
}
