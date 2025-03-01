package org.example;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
@Qualifier("customStudentService")
public class CustomStudentService implements StudentService {
    private final StudentRepository repository;
    public CustomStudentService(StudentRepository repository) {
        this.repository = repository;
    }
    @Override
    public String getStudent(int id) {
        return "Custom Service: " + repository.getStudentById(id);
    }
}
