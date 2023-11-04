package HomeWork005;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        List<Student> students = new ArrayList<>();
        students.add(new Student("1",List.of(4.0,4.0,4.0,5.0),"Информатика"));
        students.add(new Student("2",List.of(5.0,5.0,5.0,5.0),"Информатика"));
        students.add(new Student("3",List.of(4.0,5.0,5.0,5.0),"Информатика"));
        students.add(new Student("4",List.of(4.0,4.0,4.0,5.0),"Информатика"));
        students.add(new Student("5",List.of(4.0,4.0,4.0,5.0),"История"));


        List<Student> result = students.stream()
                .filter(s -> s.getSpecialty() == "Информатика")
                .filter(s -> s.getAverageGrade() > 4.5)
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
//                .sorted((a, b) -> (int) (b.getAverageGrade() - a.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Студенты:");
        System.out.println(students);
        System.out.println("Выборка:");
        System.out.println(result);
    }
}
