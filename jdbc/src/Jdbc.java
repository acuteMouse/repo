import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Jdbc {
	 static Connection conn;
	 static PreparedStatement preparedStatement;
	public static void main(String[] args) throws Exception {
		   String url = "jdbc:mysql://localhost:3306/test";
		   String name="root";
		   String password="root";
           Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
           conn = DriverManager.getConnection(url, name, password);
          preparedStatement =conn.prepareStatement("insert into user (name,password)values(?,?)");
          preparedStatement.setString(1, "aaa");
          preparedStatement.setString(2, "bbb");
          int i=preparedStatement.executeUpdate();
          System.out.println(i);
	}
}
