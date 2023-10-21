package HomeWork002;

public class Task003 {
    private int[] array;
    public Task003(int[] array) {
        this.array = array;
    }

    public boolean getDoubleZero() {
        for (int i = 1; i < this.array.length; i++) {
            if (this.array[i] == 0 && this.array[i-1] == 0) return true;        }
        return false;
    }
}
