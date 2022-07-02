package derby;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestDerby {
	private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	private static String protocol = "jdbc:derby:";
	String dbName = "E:\\Java\\Joy\\derby\\Derby_data\\firstdb";

	static void loadDriver() {
	try {
	Class.forName(driver).newInstance();
	System.out.println("Loaded the appropriate driver");
	} 
	catch (Exception e) {
	e.printStackTrace();
	}
	}

	public void doIt() {
	Connection conn = null;
	Statement s = null;
	ResultSet rs = null;

	System.out.println("starting");
	try {
	conn = DriverManager.getConnection(protocol + dbName
	+ ";create=true");
	} catch (SQLException e) {
	e.printStackTrace();
	}

	System.out.println("Connected to and created database " + dbName);

	try {

	s=conn.createStatement();
	rs=s.executeQuery("select * from firsttable");

	while (rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	}
	} catch (SQLException e1) {
	e1.printStackTrace();
	}
	try {
	conn.close();
	conn = null;
	s.close();
	s = null;
	rs.close();
	rs = null;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDerby test = new TestDerby();
		test.loadDriver();
		test.doIt();
	}

}
