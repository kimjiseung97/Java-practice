package InterfaceExample;

public class DataBaseConnectionExample {
    public static void main(String[] args) {
        //oracle db접속
        Connection conn = new OracleDriver();

        conn.getConnection("jdbc:orcale:thin:@localhost:1521:DBNAME","jiseung","1234");

        conn = new MssqlDriver();
        conn.getConnection("jdbc:mysql://localhost:1521:test","jiseung","1234");

        conn = new MysqlDriver();
        conn.getConnection("jdbc:mssql://localhost:3306:test","jiseung","1234");
    }
}
