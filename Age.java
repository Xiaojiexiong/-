import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int a = age/18;
		switch(a) {
			case 0:
			 System.out.println("you are "+age+" yound sister!");break;
			case 1:
			 System.out.println("you are "+age+" old sister!");break;

			default:
			 System.out.println("you are "+age+" old mather!");
		}
	}
}