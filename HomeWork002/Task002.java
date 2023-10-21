package HomeWork002;

public class Task002 {

    private int[] array;

    public Task002(int[] array) {
        this.array = array;
    }

    public int getDifference() {
        return getMax()-getMin();
    }

    private int getMin() {
        int min = this.array[0];
        for (int i = 1; i < this.array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    private int getMax() {
        int max = this.array[0];
        for (int i = 1; i < this.array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}
