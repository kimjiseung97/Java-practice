package InterfaceExample;

public class MssqlDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println(url + username + password + "mssql 을 접속시도한다");

    }
}
