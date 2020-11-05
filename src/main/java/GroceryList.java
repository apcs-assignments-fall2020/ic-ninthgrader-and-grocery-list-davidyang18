import java.util.Arrays;

public class GroceryList {
    private String [] arr;

    public GroceryList() {
        this.arr = new String[5];
    }

    public void add(String item) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] == null) {
                arr[i] = item;
            }
        }
    }
    public void remove(String item) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] == item) {
                arr[i] = null;
                for (int j = 0; j < 4; j++) {
                    arr[j] = arr[j-1];
                }
            }
        }
    }
    public String toString() {
        String str = Arrays.toString(arr);
        return str;
    }
}