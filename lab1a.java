import java.util.Scanner;
public class lab1a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int INTEREST_RATE=5;
		System.out.println("Enter Balance "); // print to screen
		
		Scanner keyboard = new Scanner(System.in); // create object to read from keyboard
	
		int Balance = keyboard.nextInt(); // using keyboard to read a number
		
		System.out.println("On a balance of $\r\n" + "" + Balance);
		
		double Interest = Balance * (INTEREST_RATE/100.0);
		
		System.out.println("You will earn interest of $"
				+ "" + Interest);
		
		System.out.println("All in just one short year. "); 
		keyboard.close();
	}

}
