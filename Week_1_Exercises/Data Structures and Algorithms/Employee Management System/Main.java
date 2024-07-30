public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee emp1 = new Employee("E001", "Alice", "Developer", 75000);
        Employee emp2 = new Employee("E002", "Bob", "Designer", 65000);
        Employee emp3 = new Employee("E003", "Charlie", "Manager", 85000);

        // Add employees
        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        // Traverse employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearch for Employee E002:");
        System.out.println(ems.searchEmployee("E002"));

        // Delete an employee
        ems.deleteEmployee("E002");
        System.out.println("\nAll Employees after deleting Employee E002:");
        ems.traverseEmployees();
    }
}
