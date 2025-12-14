package Chain100Days;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("E1001", "Alice", 60000, "Engineering" );

        employee.setName("Alice Johnson");
        employee.giveRaise(10);

        System.out.println(employee.getSalary()); // 66000.0
        System.out.println(employee);

    }
}

// Implement a class with encapsulation and accessors