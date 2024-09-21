/*14. **Write a program that converts a `List` of objects (with `id` and `name`) into a `Map` where the `id` is the key and the `name` is the value.**
    - Input: `[Employee{id=1, name='John'}, Employee{id=2, name='Jane'}]`
    - Output: `{1=John, 2=Jane}`*/


package Main.Java.Map.Hard;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John"),
                new Employee(2, "Jane")
        );

        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(employeeMap);
    }
}