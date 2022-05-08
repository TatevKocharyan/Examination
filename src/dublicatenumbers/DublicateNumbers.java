package dublicatenumbers;

public class DublicateNumbers {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 2, 4, 8, 3, 1, 55, 49, 98, 67};
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j =i+ 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }

            }if (count > 1) {
                System.out.println(count);


        }
    }
}
