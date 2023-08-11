package stringClassExample;

public class StringManipulation {
    public static void main(String[] args) {

        int a = 10;

        String str = "HelloWorld";


        String s = str.replaceAll("o", "X");
        //값을 변경하더라도 원본의 str주소의 값은 바뀌지않는다

        char c = str.charAt(0);

        System.out.println(str.length());

        System.out.println(s);

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(c);

        System.out.println(str.substring(0,4));

        System.out.println(str.indexOf("d"));

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }



    }
}
