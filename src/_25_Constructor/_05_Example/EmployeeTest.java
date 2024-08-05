package _25_Constructor._05_Example;

public class EmployeeTest {
    public static void main(String[] args) {
        // Dört farklı çalışan nesnesi oluşturulur.
        Employee employee1 = new Employee("Alice", "Engineering", 5000);
        Employee employee2 = new Employee("Bob", "HR");
        Employee employee3 = new Employee("Charlie");
        Employee employee4 = new Employee();

        // Her çalışanın bilgileri ekrana yazdırılır.
        employee1.displayInfo(); // Output: Name: Alice, Department: Engineering, Salary: 5000.0
        employee2.displayInfo(); // Output: Name: Bob, Department: HR, Salary: 3000.0
        employee3.displayInfo(); // Output: Name: Charlie, Department: Unknown, Salary: 3000.0
        employee4.displayInfo(); // Output: Name: Unknown, Department: Unknown, Salary: 3000.0
    }
}
