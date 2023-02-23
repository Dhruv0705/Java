package Employee;

import java.util.Scanner; 
import java.util.ArrayList;

public class EmployeeTester {
    public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Employee newEmployee = new Employee("Sally","123 Sesame St","555-123-4567",10000);
			System.out.println(newEmployee.toString());
			System.out.print("Enter a new name: ");
			String name = input.nextLine();
			newEmployee.setName(name);
			System.out.println(newEmployee.toString());

			System.out.println(newEmployee.toString());
			System.out.print("Enter a new position: ");
			String position = input.nextLine();
			newEmployee.setPosition(position);
			System.out.println(newEmployee.toString());

			System.out.println(newEmployee.toString());
			System.out.print("Enter a new salary: ");
			int salary = input.nextInt();
			newEmployee.setSalary(salary);
			System.out.println(newEmployee.toString());


			ArrayList<Employee> myEmployee = new ArrayList<Employee>();
			myEmployee.add(newEmployee);
		}
		

	} 
}
