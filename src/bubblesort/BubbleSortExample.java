package bubblesort;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] array = {2, 5, 4, 8, 3, 1, 55, 49, 98, 67};

        for (int i = 0; i < array.length; i++) {
            for (int j =1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }












    }}
