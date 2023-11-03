package HomeWork005;

import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }


    public double getAverageGrade() {
        return grades.stream()
                .collect(Collectors.averagingDouble(Double::doubleValue));
    }
}

