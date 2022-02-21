package stream.casestudy.assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	
	public static void main(String[] args) {
		Department dept = new Department(1, 25, "project");
		Department dept1 = new Department(2, 35, "testing");
		List<EmployeeRepository> empList = new ArrayList<EmployeeRepository>();
		empList = Arrays.asList(
				new EmployeeRepository(101, 1, "abhi", "nellur", "abhinellur@gmail.com", "7026252757", "Executive",
						LocalDate.of(2021, 4, 17), 35000d, dept),
				new EmployeeRepository(106, 2, "shiva", "patil", "shivapatil@gmail.com", "3482673892", "Analyst",
						LocalDate.of(2021, 4, 11), 20000d, dept1),
				new EmployeeRepository(102, 1, "ravi", "kumar", "ravikumar@gmail.com", "2834783292", "Executive",
						LocalDate.of(2021, 4, 05), 30500d, dept),
				new EmployeeRepository(103, 1, "arun", "kumar", "arunkumar@gmail.com", "2374677283", "Analyst",
						LocalDate.of(2021, 4, 17), 40000d, dept));
				
		for (EmployeeRepository e : empList) {
			System.out.println(e);
		}
		System.out.println("\n\n Find out the sum of salary of all employees.\n");
		Optional<Double> o = empList.stream().map(emp -> emp.getSalary()).reduce((a, b) -> (a + b));
		if (o.isPresent()) {
			System.out.println("Sum of all Salaries: " + o.get());
		}
		System.out.println("\n\n List out department names and count of employees in each department.\n");
		Map<Department, Long> de = empList.stream()
				.collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
		System.out.println(de);
		LocalDate d = LocalDate.now();
		System.out.println("\n\n  List employee name and duration of their service in months and days.");
		empList.forEach(e -> System.out.println(e.getFirstName() + "\t " + Period.between(d, e.getHireDate())));
		System.out.println("\n\n Sort employees by their\r\nEmployee id\r\nDepartment id\r\nFirst name.");
		System.out.println("\nsorting by employee id: ");
		List<EmployeeRepository> e1 = empList.stream().sorted((a, b) -> a.getId() - (b.getId()))
				.collect(Collectors.toList());
		System.out.println(e1);
		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\nsorting by First Name: ");
		e1 = empList.stream().sorted(Comparator.comparing(EmployeeRepository::getFirstName))
				.collect(Collectors.toList());
		System.out.println(e1);
		for (Object a : e1) {
			System.out.println(a);
		}
		System.out.println("\n\n departments with highest count of employees.");
		de = empList.stream().limit(1)
				.collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
		System.out.println(de);
		for (Object a : e1) {
			System.out.println(a);
		}
	}
	
	

}
