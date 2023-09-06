package Lesson_work_3;

import java.util.Arrays;
import java.util.Random;

public class Program {

	private static Random random = new Random();

	public static Employee generateEmployee() {
		String[] names = new String[] { "Авдей", "Адам", "Аким", "Борис", "Вадим", "Глеб", "Денис" };
		String[] surNames = new String[] { "Иванов", "Петров", "Сидоров", "Иванов", "Петров", "Сидоров", "Иванов" };

		int salaryIndex = random.nextInt(300, 500);
		int employeeAge = random.nextInt(18, 62);
		int randomEmployee = random.nextInt(1, 3);
		Employee employee;
		if (randomEmployee == 1) {
			employee = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)],
					salaryIndex * 100, employeeAge);
		} else {
			employee = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)],
					salaryIndex * 100, employeeAge, 0, 9);
		}

		return employee;
	}

	public static Employee[] generateEmployees(int counter) {
		Employee[] employees = new Employee[counter];
		for (int i = 0; i < counter; i++) {
			employees[i] = generateEmployee();
		}
		return employees;
	}

	public static void main(String[] args) {
		Employee[] employees = generateEmployees(5);

		for (Employee employee : employees) {
			System.out.println(employee);
		}
		Arrays.sort(employees, new EmployeeComparatorAge());
		System.out.println("========================================================");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		Arrays.sort(employees, new EmployeeComparatorSalary());
		System.out.println("========================================================");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		Arrays.sort(employees);
		System.out.println("========================================================");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
