import java.util.Scanner;

public class EmpDetails
{
    public static void main (String[] args)
    {
	Scanner inp = new Scanner(System.in);

	System.out.printf("Enter Employee Name: ");
	String name = inp.nextLine();
	System.out.printf("Enter monthly salary: ");
	double salary = inp.nextDouble();
	Employee emp1 = new Employee(name, salary);
//	System.out.println(emp1);
//	System.out.println("Annual Salary: " + emp1.annualSalary() + "\n");

	
	System.out.printf("Enter Employee Name: ");
	name = inp.nextLine();
	name = inp.nextLine();
	System.out.printf("Enter monthly salary: ");
	salary = inp.nextDouble();
	Employee emp2 = new Employee(name, salary);
//	System.out.println(emp2);
//	System.out.println("Annual Salary: " + emp2.annualSalary() + "\n");

	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println("\nsalary after increment by 10%\n");
	emp1.setMonSalary(1.1 * emp1.getMonSalary());
	emp2.setMonSalary(1.1 * emp2.getMonSalary());
	System.out.println("New Annual Salary of Employee 1: " + emp1.annualSalary());
	System.out.println("New Annual Salary of Employee 2: " + emp2.annualSalary());

    }
}
