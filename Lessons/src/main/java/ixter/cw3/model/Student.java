package ixter.cw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private int salary;
    private List<Integer> marks;

    public int getMarkSum() {
        int sum = 0;
        for (int value : this.marks) {
            sum += value;
        }
        return sum;
    }
}