import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException/*DB������ �� ����*/ {
		//1.DriverLoading
		Class.forName("oracle.jdbc.OracleDriver");//new�� ���� ������ ������ �� ������ üũ�� ����� �Ѵ�. �� �� ���� ���� Class.forName
		
		//2.Connection
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection conn = DriverManager.getConnection(url, "hr", "hr");//new�� �Ⱦ� : static�̱� ������
		
		//3.SQL ����, SQL ó��
		String query = "select last_name || first_name as �̸�, phone_number as ��ȭ��ȣ from employees";
		Statement stmt = conn.createStatement(); //connection�� �������� query ������.
		ResultSet rs = stmt.executeQuery(query);
		 
		//4.���
		while(rs.next()){
			System.out.println(rs.getString(1) + " " + rs.getString(2));//1:column index
		}
		
		//5.����
		rs.close();
		stmt.close();
		conn.close();//���� �ð� DB�� �����Ѵٴ� ���� connection�� �����Ѵ� �ǹ�
		
		System.out.println("end");
	}
}