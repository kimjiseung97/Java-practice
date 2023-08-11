package stringClassExample;

public class StringCompareExample {
    public static void main(String[] args) {
        String str1 = "Hello";

        String str2 = "World";

        int i = str1.compareToIgnoreCase(str2);

        boolean equals = str1.equals(str2);

        if (equals){
            System.out.println(equals);
        }else{
            System.out.println(equals);
        }


        if(i==0){
            System.out.println("두 문자열은 같습니다");
        }else if(i<0){
            System.out.println("두 문자열은 다릅니다");
        }else{
            System.out.println("두 문자열은 다릅니다");
        }
    }

}
