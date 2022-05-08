package maxofarray;

public class SecondMaxOfArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 8, 3, 1, 55, 49,88,98, 67};

        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                secondMax=max;
                max=array[i];

            }else if (array[i]>secondMax){
                secondMax=array[i];
            }

        }
        System.out.println(secondMax);



    }
}
