package maxofarray;

public class MaxOfArrayExample {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 8, 3, 1, 55, 49, 98, 67};

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println(max);
    }
}