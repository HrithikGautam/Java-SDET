/*13. **Implement a program using a `TreeMap` that stores employee names and their salaries, and can return the employee with the highest salary.**
    - Input: `{John=3000, Alice=5000, Bob=4500}`
    - Output: `Alice`*/

package Main.Java.Map.Hard;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeSalary {
    public static void main(String[] args) {
        TreeMap<String, Integer> employeeMap = new TreeMap<>();
        employeeMap.put("John", 3000);
        employeeMap.put("Alice", 5000);
        employeeMap.put("Bob", 4500);

        // Finding employee with the highest salary
        String highestPaidEmployee = employeeMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Employee with the highest salary: " + highestPaidEmployee);
    }
}
