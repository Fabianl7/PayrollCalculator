import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			// Ask the user for input
			System.out.print("Enter the Employee's full name: ");
			String name = input.nextLine();
			System.out.print("Enter the Employee's number: ");
			String number = input.nextLine();
			System.out.print("Enter the pay rate per hour: ");
			double payRate = input.nextDouble();
			System.out.print("Enter the regular hours worked: ");
			double hoursWorked = input.nextDouble();
			
			System.out.println("\nThank you!");
			System.out.println("\nHere is your paycheck!\n");
			
			System.out.println("------------------------------------------");
			
			// Print the user's input
			System.out.println("Employee's name:\t" + name);
			System.out.println("Employee's number:\t" + number);
			System.out.println("Hourly rate of pay:\t" + payRate);
			System.out.printf("Hours worked:\t\t%.2f\n", hoursWorked);
			
			// Process the data to calculate the pay
			double grossPay = payRate * hoursWorked;
			double tax = 0.06;
			System.out.println("\nTotal Gross Pay:\t" + grossPay);
			
			System.out.printf("\nDeductions\nTax (6%%):\t\t%.2f\n", grossPay*tax);
			
			System.out.printf("\nNet Pay:\t\t%.2f Dollars\n", grossPay-(grossPay*tax));
			
			System.out.println("------------------------------------------");
			System.out.print("\n\nBye!");
		}
}