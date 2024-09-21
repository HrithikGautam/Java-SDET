/*10. **Create a `Map` that stores students' names and their marks.
Write a program to print the name of the student with the highest marks.**
        - Input: `{John=75, Alice=85, Bob=95}`
        - Output: `Bob`*/

package Main.Java.Map.Medium;

import java.util.HashMap;
import java.util.Map;

public class HighestMarks {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("John", 75);
        students.put("Alice", 85);
        students.put("Bob", 95);

        String topStudent = "";
        int highestMarks = 0;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > highestMarks) {
                highestMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Student with highest marks: " + topStudent);
    }
}
