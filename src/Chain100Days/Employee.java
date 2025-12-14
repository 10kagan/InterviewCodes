package Chain100Days;

public class Employee {

    private final String employeeId;
    private String name;
    private double salary;
    private String department;

    public Employee(String employeeId, String name, double salary, String department){
        if (employeeId == null || employeeId.isEmpty()){
            throw new IllegalArgumentException("Employee ID cannot be empty");
        }
        if (salary < 0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setName (String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public void setDepartment (String department){
        this.department = department;
    }

    public void giveRaise (double percentage){
        if (percentage < 0){
            throw new IllegalArgumentException("Raise percentage must be positive");
        }
        salary += salary * (percentage / 100);
    }

    public String toString(){
        return "Employee{" +
                "id='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}

