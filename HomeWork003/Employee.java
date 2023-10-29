package HomeWork003;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private int salary;

    public Employee(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        Calendar currentDate = Calendar.getInstance();
        Calendar thisDate = new GregorianCalendar(birthYear, birthMonth, birthDay);
        return currentDate.get(Calendar.YEAR) - thisDate.get(Calendar.YEAR);
    }

    public int compare(int day, int month, int year){
        Calendar thisDate = new GregorianCalendar(birthYear, birthMonth, birthDay);
        Calendar compareDate = new GregorianCalendar(year, month, day);
        return thisDate.compareTo(compareDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                ", birthYear=" + birthYear +
                ", salary=" + salary +
                '}';
    }
}
