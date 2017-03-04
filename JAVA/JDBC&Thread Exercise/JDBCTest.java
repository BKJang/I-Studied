import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException/*DB연결할 때 오류*/ {
		//1.DriverLoading
		Class.forName("oracle.jdbc.OracleDriver");//new를 쓰면 되지만 컴파일 할 때마다 체크를 해줘야 한다. 이 때 쓰는 것이 Class.forName
		
		//2.Connection
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection conn = DriverManager.getConnection(url, "hr", "hr");//new를 안씀 : static이기 때문에
		
		//3.SQL 전달, SQL 처리
		String query = "select last_name || first_name as 이름, phone_number as 전화번호 from employees";
		Statement stmt = conn.createStatement(); //connection을 기준으로 query 날리자.
		ResultSet rs = stmt.executeQuery(query);
		 
		//4.출력
		while(rs.next()){
			System.out.println(rs.getString(1) + " " + rs.getString(2));//1:column index
		}
		
		//5.종료
		rs.close();
		stmt.close();
		conn.close();//일정 시간 DB를 유지한다는 것은 connection을 유지한단 의미
		
		System.out.println("end");
	}
}