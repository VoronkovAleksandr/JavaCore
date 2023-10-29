package HomeWork003;

public class Manager extends Employee{

    public Manager(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, int salary) {
        super(firstName, lastName, birthDay, birthMonth, birthYear, salary);
    }
    public static void updateSalaryForOther(Employee[] emp, int minAge, int maxAge, int value) {
        for (Employee e : emp
        ) {
            if (e.getAge() > minAge && e.getAge() < maxAge){
               if (!(e instanceof Manager)){
                   e.setSalary(e.getSalary() + value);
               }
            }
        }
    }
}
