package org.example;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {
    private final Map<Integer, String> students = new HashMap<>();
    public StudentRepository() {
        students.put(1, "Dauka");
        students.put(2, "Daulet");
        students.put(3, "Daukasss");
    }
    public String getStudentById(int id) {
        return students.getOrDefault(id, "Student Not Found");
    }
}
