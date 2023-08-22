package APIExample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApiExample {
    public static void main(String[] args) {
        String apiKey = "40275d41acb183877550f54b1a82d955";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey +"&units=metric";

        try{
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept", "application/json");

            int responseCode = httpURLConnection.getResponseCode();

            if(responseCode==200){
               BufferedReader in =new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
               String inputLIne;
               StringBuffer content = new StringBuffer();
               while ((inputLIne=in.readLine())!=null){
                   content.append(inputLIne);
               }
                in.close();
                System.out.println(content.toString());
            }else{
                //응답이 잘못됌
            }

        }catch (Exception e){
            e.printStackTrace(); //에러메세지 출력
        }
    }
}
