package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = context.getBean(StudentService.class);
        System.out.println(studentService.getStudent(1));
        StudentService customService = context.getBean("customStudentService", StudentService.class);
        System.out.println(customService.getStudent(2));
        System.out.println(customService.getStudent(3));
        context.getBean(LazySingleton.class);
        context.close();
    }
}
