package APIExample;

import java.lang.reflect.Array;
import java.util.Arrays;


public class IntArray {

    private final int DEFAULT_CAPACITY = 5; // final 선언시 수정불가(상수화)
    private int[] elements;
    private int size = 0;

    //생성자
    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }

    //저장하는 동작
    public void add(int element){ //이미 배열이 다 찼으면 삽입할 수 없다.
         //크기 체크
        if (size==elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++]= element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements=Arrays.copyOf(elements,newCapacity);
    }

    //얻는 동작
    public int get(int index){ //음수라던가 배열의 범위를 벗어나는 인덱스이면 안된다
        //인덱스 체크
        return elements[index];
    }

    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }



}
