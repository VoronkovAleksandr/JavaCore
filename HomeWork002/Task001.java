package HomeWork002;

import java.util.Arrays;
import java.util.Random;

public class Task001 {
    private int[] array;

    public Task001(int sizeArray) {
        this.array = new int[sizeArray];
        fillArray();
    }

    private void fillArray() {
        Random random = new Random();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            this.array[i] = random.nextInt(0, 3);
        }
    }
    public int[] getArray(){
        return this.array;
    }


    public int countEvens() {
        int count = 0;
        for (int item: this.array) {
            if (item%2 == 0) count +=1;
        }
        return count;
    }

    public String getArrayToString() {
        return Arrays.toString(this.array);
    }
}
