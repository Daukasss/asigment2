package org.example;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class DefaultStudentService implements StudentService {
    private final StudentRepository repository;
    public DefaultStudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public String getStudent(int id) {
        return "Default " + repository.getStudentById(id);
    }
}
