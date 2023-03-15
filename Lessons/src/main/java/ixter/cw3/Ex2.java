package ixter.cw3;

import ixter.cw3.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Дан массив объектов: фамилия студента, номер группы, размер стипендии,
 * баллы по 3 предметам. Определить стипендии студентов,
 * фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
public class Ex2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 234, List.of(3, 3, 4));
        Student student2 = new Student("Машкова", 2, 235, List.of(3, 3, 4));
        Student student3 = new Student("Котлов", 2, 236, List.of(3, 3, 4));
        Student student4 = new Student("Михин    ", 2, 237, List.of(2, 3, 4));

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        List<Integer> listSalary = new ArrayList<>();
        for (Student item : listStudent) {
            if (item.getSurname().endsWith("ова") && item.getMarkSum() % 2 == 0) {
                listSalary.add(item.getSalary());
            }
        }

        System.out.println(listSalary);
    }
}
