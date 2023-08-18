package FunctionalInterfaceExample;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lambda Expression";

        System.out.println(processString(input,toUpperCase));
        System.out.println(processString(input,String::toLowerCase));
    }

    public static String processString(String input,StringOperation operation){
        return operation.apply(input);
    }
}
