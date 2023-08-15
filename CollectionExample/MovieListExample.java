package CollectionExample;

import java.util.ArrayList;

public class MovieListExample {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>(); //Movie 객체의 배열 생성 따로 제네릭타입 설정안하면 오브젝트타입으로 가기때문에 업 다운 케스팅필요

        list.add(new Movie("괴물","봉준호","2006","대한민국"));
        list.add(new Movie("기생충","봉준호","2019","대한민국"));
        list.add(new Movie("완벽한타인","이재규","2018","대한민국"));

        for (Movie movie : list) {
            System.out.println(movie);
        }

        String searchTitle = "기생충";
        //순차검색 -> 이진검색
        for (Movie movie : list) {
            if (movie.getTitle().equals(searchTitle)){
                System.out.println(movie.toString());
                break;
            }
        }

    }
}
