package APIExample;

public class IntArrayTest {
    public static void main(String[] args) {

        //정수 세개를 배열에 저장하고 출력시켜보자

        IntArray intArray = new IntArray(); //5크기의 정수 배열 반환

        intArray.add(3); //배열에 값 추가
        intArray.add(10);
        intArray.add(6);



        System.out.println(intArray.get(1)); //1인덱스의 값 출력
    }
}
