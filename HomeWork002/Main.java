package HomeWork002;

public class Main {
    public static void main(String[] args) {
        /*
        Написать метод, возвращающий количество чётных элементов массива.
        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
         */
        Task001 task001 = new Task001(10);
        System.out.printf("%s -> %d\n", task001.getArrayToString(), task001.countEvens());

        /*
        Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного
        не пустого массива.
         */
        Task002 task002 = new Task002(task001.getArray());
        System.out.printf("Разница между максимальным и минимальным значением массива: %d\n",task002.getDifference());

        /*
        Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента,
        с нулевым значением.
         */
        Task003 task003 = new Task003(task001.getArray());
        System.out.println(task003.getDoubleZero());
    }
}
