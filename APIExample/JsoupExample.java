package APIExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";
        //예외처리 추가
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
            Element bibleText = document.getElementById("bible_text");
            Element bibleInfoBox = document.getElementById("bible_info_box");

            System.out.println("bibletext = " + bibleText);
            System.out.println("bibleInfoBox = " + bibleInfoBox);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
