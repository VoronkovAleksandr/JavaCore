package HomeWork003;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Иван", "Иванов", 1,6,1995, 15000 );
        System.out.println(ivan);
        System.out.println(ivan.compare(1,6,1994));
        System.out.println(ivan.compare(1,6,1995));
        System.out.println(ivan.compare(1,6,1996));

        Employee petr = new Manager("Петр", "Петров", 2,6,1985, 20000);
        Employee[] company = {ivan, petr};
        printEmployees(company);
        Manager.updateSalaryForOther(company, 0, 100, 123);
        printEmployees(company);
    }

    private static void printEmployees(Employee[] company) {
        for (Employee employee : company) {
            System.out.println(employee);
        }
    }
}
