package method;

import java.util.Arrays;

public class ObjectClass {

	public ObjectClass(String s, int[] iArr) {
		System.out.println("--- ObjectClass() START ---");
		System.out.printf("2개의 파라미터 : " + s);
		System.out.println("\n");
		System.out.printf("2개의 파라미터 : " + Arrays.toString(iArr));
	}
	
}
