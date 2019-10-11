package interface_study;

public class MainClass {

	public static void main(String[] args) {
		
		InterfaceA ia = new InterfaceClass();
		InterfaceB ib = new InterfaceClass();
		
		ia.funcA();
		ib.funcB();
		
		UnivInfo korea = new UniversityA();
		UnivInfo seoul = new UniversityB();
		
		UnivInfo[] UnivInfo = {korea, seoul};
		
		for(int i = 0 ; i <UnivInfo.length ; i++) {
			UnivInfo[i].getName();
			UnivInfo[i].getNumber();
		}

	}

}
