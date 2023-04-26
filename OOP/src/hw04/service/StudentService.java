package hw04.service;

import hw04.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = getMaxId();
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }

    @Override
    public Long getId(Student student) {
        return student.getStudentId();
    }

    @Override
    public Long getMaxId() {
        return getMaxId(students);
    }
}
