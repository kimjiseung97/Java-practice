package FunctionalInterfaceExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동","김길동","고길동");
        Collections.sort(names);

        System.out.println(names);


    }
}
