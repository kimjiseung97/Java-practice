package InterfaceExample;

public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println(url + username + password + "을 접속시도한다");
    }
}
