import java.io.FileInputStream;
import java.io.InputStream;

public class test {
	public static void main(String[] args) {
		
		//FileInputStream fs = new FileInputStream("C://User/KISMI13/Desktop/text.txt");
		
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("C:\\Users\\KISMI13\\Desktop\\text.txt");
			int data=0;
			while(true) {
				
				try {
					data = inputStream.read();
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
