public class Employee
{
    private String empName;
    private double monSalary;

    public Employee(String name, double salary)
    {
	this.empName = name;
	this.monSalary = salary;
    } // end of constructor Employee

    public String getEmpName()
    {
	return this.empName;
    } // end of method getEmpName

    public double getMonSalary()
    {
	return this.monSalary;
    } // end of method getMonSalary

    public void setMonSalary(double salary)
    {
	this.monSalary = salary;
    } // end of method setMonSalary

    public double annualSalary()
    {
	return 12 * this.monSalary;
    } // end of method annualSalary

    public String toString()
    {
	String str = "( Employee name: " + this.empName + " Monthly Salary: "+ this.monSalary + ")";
	return str;
    } // end of method toString

} //end of class Employee
