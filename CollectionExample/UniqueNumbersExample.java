package CollectionExample;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbersExample {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,1,3,4,2,4,11,13,23};

        Set<Integer> numbersSet = new HashSet<>();

        for (int num : nums) {
            numbersSet.add(num);
        }

        System.out.println(numbersSet);
    }
}
