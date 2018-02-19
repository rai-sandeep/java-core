package sort.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortObjectsMain {

	public static void main(String[] args) {
		
		sortWithComparator();
		sortWithComparable();
		
	}

	private static void sortWithComparator() {
		Employee sandeep = new Employee("Sandeep", LocalDate.of(1987, 5, 29), LocalDate.of(2009, 10, 26));
		Employee ravi = new Employee("Ravi", LocalDate.of(1983, 8, 7), LocalDate.of(2016, 1, 29));
		Employee chetti = new Employee("Chetti", LocalDate.of(1986, 11, 2), LocalDate.of(2008, 9, 22));
		Employee roshni = new Employee("Roshni", LocalDate.of(1992, 5, 31), LocalDate.of(2014, 3, 12));
		Employee alex = new Employee("Alex", LocalDate.of(1980, 7, 14), LocalDate.of(2005, 12, 2));
		
		List<Employee> employees = new ArrayList<Employee>(5);
		employees.add(sandeep);
		employees.add(ravi);
		employees.add(chetti);
		employees.add(roshni);
		employees.add(alex);
		
		System.out.println("Employee List: ");
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
		
		Collections.sort(employees, new EmployeeAgeComparator());
		
		System.out.println("\nAfter EmployeeAgeComparator: ");
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
		
		Collections.sort(employees, new EmployeeExperienceComparator());
		
		System.out.println("\nAfter EmployeeExperienceComparator: ");
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
		
	}

	private static void sortWithComparable() {
		EmployeeComparable sandeep = new EmployeeComparable("Sandeep", LocalDate.of(1987, 5, 29), LocalDate.of(2009, 10, 26));
		EmployeeComparable ravi = new EmployeeComparable("Ravi", LocalDate.of(1983, 8, 7), LocalDate.of(2016, 1, 29));
		EmployeeComparable chetti = new EmployeeComparable("Chetti", LocalDate.of(1986, 11, 2), LocalDate.of(2008, 9, 22));
		EmployeeComparable roshni = new EmployeeComparable("Roshni", LocalDate.of(1992, 5, 31), LocalDate.of(2014, 3, 12));
		EmployeeComparable alex = new EmployeeComparable("Alex", LocalDate.of(1980, 7, 14), LocalDate.of(2005, 12, 2));
		
		List<EmployeeComparable> employees = new ArrayList<EmployeeComparable>(5);
		employees.add(sandeep);
		employees.add(ravi);
		employees.add(chetti);
		employees.add(roshni);
		employees.add(alex);
		
		System.out.println("\nEmployee List: ");
		for (EmployeeComparable employee : employees) {
			System.out.println(employee.getName());
		}
		
		Collections.sort(employees);
		
		System.out.println("\nWith Comparable: ");
		for (EmployeeComparable employee : employees) {
			System.out.println(employee.getName());
		}
		
	}

}
