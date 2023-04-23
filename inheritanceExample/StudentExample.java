package inheritanceExample;

public class StudentExample {

    public static void main(String[] args) {
        Student student = new Student("홍길동","1234567-1234567",1);

        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);
    }
}
