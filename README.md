# Payroll Calculator

This simple Java program calculates the net pay for an employee based on their hourly pay rate, hours worked, and a fixed tax rate. It provides a user-friendly interface for entering employee information and displays a detailed paycheck summary.

## Usage

1. **Compile the Program:**
   - Make sure you have Java installed on your system.
   - Open a terminal and navigate to the directory containing the `Main.java` file.
   - Compile the program using the following command:
     ```bash
     javac Main.java
     ```

2. **Run the Program:**
   - After compilation, run the program with the following command:
     ```bash
     java Main
     ```

3. **Enter Employee Information:**
   - Follow the prompts to enter the employee's full name, employee number, pay rate per hour, and regular hours worked.

4. **View Paycheck Summary:**
   - The program will display a detailed paycheck summary, including the employee's name, number, pay rate, hours worked, gross pay, tax deductions, and net pay.

5. **Exit the Program:**
   - Once the paycheck summary is displayed, the program will say goodbye, and you can exit.

## Example

```bash
Enter the Employee's full name: John Doe
Enter the Employee's number: EMP123
Enter the pay rate per hour: 15.50
Enter the regular hours worked: 40

Thank you!

Here is your paycheck!

------------------------------------------
Employee's name:        John Doe
Employee's number:      EMP123
Hourly rate of pay:     15.5
Hours worked:           40.00

Total Gross Pay:        620.00

Deductions
Tax (6%):               37.20

Net Pay:                582.80 Dollars
------------------------------------------

Bye!
