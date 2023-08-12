package stringClassExample;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {

        String str = "Hello World  Java";

        // String[] split = strArray.split(",");
        String[] strArray = str.split("\\s+");

        for (String s : strArray) {
            System.out.println(s);
        }

        Scanner scanner = new Scanner(System.in);

        String next = scanner.next();

        String[] splitArray = next.split("s");

        for (String s : splitArray) {
            System.out.println(s);
        }
    }
}
