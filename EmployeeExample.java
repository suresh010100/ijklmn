class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 60000, "IT");
        Programmer programmer = new Programmer("Jane Smith", 70000, "Java");

        System.out.println("Manager Information:");
        manager.displayInfo();
        System.out.println();

        System.out.println("Programmer Information:");
        programmer.displayInfo();
    }
}
