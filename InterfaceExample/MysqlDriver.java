package InterfaceExample;

public class MysqlDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println(url + username + password + "mysql 을 접속시도한다");

    }
}
