package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(1,20);
        System.out.println(numbers);
        System.out.println(numbers.contains(14));
    }
}
