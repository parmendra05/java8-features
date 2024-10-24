package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1001, "arun", "ar@gmail.com", 30000));
        empList.add(new Employee(1002, "swami", "sm@gmail.com", 15000));
        empList.add(new Employee(1003, "rakesh", "rk@gmail.com", 750000));
        empList.add(new Employee(1004, "daisy", "ds@gmail.com", 20000));
        empList.add(new Employee(1005, "lisa", "ls@gmail.com", 50000));
        empList.add(new Employee(1006, "anugrah", "as@gmail.com", 30000));

        empList.add(new Employee(1001, "arun", "ar@gmail.com", 30000));
        empList.add(new Employee(1002, "swami", "sm@gmail.com", 15000));
        empList.add(new Employee(1003, "rakesh", "rk@gmail.com", 750000));
        empList.add(new Employee(1004, "daisy", "ds@gmail.com", 20000));
        empList.add(new Employee(1005, "lisa", "ls@gmail.com", 50000));
        empList.add(new Employee(1006, "anugrah", "as@gmail.com", 30000));


        // Fetching the element using Stream

        long beforeExecution = System.currentTimeMillis();
        // Find the student whose salary is more than 30000
        empList.stream().filter(e -> e.getSalary() >= 30000).forEach(System.out::println);

        long afterExecution = System.currentTimeMillis();
        System.out.println("Execution Time taken by Stream " + (afterExecution - beforeExecution));
        // output : Execution Time taken by Stream 16

        // // Fetching the element using ParallelStream

        beforeExecution = System.currentTimeMillis();
        // Find the student whose salary is more than 30000
        empList.parallelStream().filter(e -> e.getSalary() >= 30000).forEach(System.out::println);

        afterExecution = System.currentTimeMillis();
        System.out.println("Execution Time taken by ParallelStream " + (afterExecution - beforeExecution));
        // output : Execution Time taken by ParallelStream 0

        // Note : LocalTime can't apply with operators
    }

}

class Employee {
    private Integer id;
    private String name;
    private String email;
    private Integer salary;

    public Employee(Integer id, String name, String email, Integer salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
    }

}
