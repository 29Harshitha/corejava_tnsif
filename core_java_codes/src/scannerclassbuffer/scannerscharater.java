package scannerclassbuffer;
import java.util.Scanner;

public class scannerscharater {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		char c=scan.next().charAt(1);
		System.out.println("The second character of the input string is "+c);
		scan.close();
		
		

	}


}
