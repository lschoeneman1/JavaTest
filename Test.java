import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding some employees
        employees.add(new Employee(1, "John Doe"));
        employees.add(new Employee(2, "Jane Smith"));
        employees.add(new Employee(3, "Alice Johnson"));

        // Printing the employees
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
