import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	static Connection conn;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Great_Learning", "root", "root");

		PreparedStatement preparedStatement_1 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		//a. Insert 5 records.
		int id1 = 1;
		String name_1 = "Subbu";
		String email_1 = "subbu@greatlearning.com";
		String Phone_1 = "9999999999";

		preparedStatement_1.setInt(1, id1);
		preparedStatement_1.setString(2, name_1);
		preparedStatement_1.setString(3, email_1);
		preparedStatement_1.setString(4, Phone_1);

		int rowCount = preparedStatement_1.executeUpdate();
		System.out.println(rowCount + " Row inserted");

		PreparedStatement preparedStatement_2 = conn.prepareStatement("insert into Employee values (?,?,?,?)");

		int id2 = 2;
		String name_2 = "Ashish";
		String email_2 = "ashish@greatlearning.com";
		String Phone_2 = "8888888888";

		preparedStatement_2.setInt(1, id2);
		preparedStatement_2.setString(2, name_2);
		preparedStatement_2.setString(3, email_2);
		preparedStatement_2.setString(4, Phone_2);

		int rowCount1 = preparedStatement_2.executeUpdate();
		System.out.println(rowCount1 + " Row inserted");

		PreparedStatement preparedStatement_3 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id3 = 3;
		String name_3 = "Jagadish";
		String email_3 = "jagadish@greatlearning.com";
		String Phone_3 = "7777777777";

		preparedStatement_3.setInt(1, id3);
		preparedStatement_3.setString(2, name_3);
		preparedStatement_3.setString(3, email_3);
		preparedStatement_3.setString(4, Phone_3);

		int rowCount2 = preparedStatement_3.executeUpdate();
		System.out.println(rowCount2 + " Row inserted");

		PreparedStatement preparedStatement_4 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id4 = 4;
		String name_4 = "Rakesh";
		String email_4 = "rakesh@greatlearning.com";
		String Phone_4 = "6666666666";

		preparedStatement_4.setInt(1, id4);
		preparedStatement_4.setString(2, name_4);
		preparedStatement_4.setString(3, email_4);
		preparedStatement_4.setString(4, Phone_4);

		int rowCount3 = preparedStatement_4.executeUpdate();
		System.out.println(rowCount3 + " Row inserted");

		PreparedStatement preparedStatement_5 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id5 = 5;
		String name_5 = "Srinu";
		String email_5 = "srinu@greatlearning.com";
		String Phone_5 = "5555555555";

		preparedStatement_5.setInt(1, id5);
		preparedStatement_5.setString(2, name_5);
		preparedStatement_5.setString(3, email_5);
		preparedStatement_5.setString(4, Phone_5);

		int rowCount4 = preparedStatement_5.executeUpdate();
		System.out.println(rowCount4 + " Row inserted");

		//b. Modify Email_Id column to varchar(30) NOT NULL.
		PreparedStatement preparedStatement_6 = conn.prepareStatement("alter table employee modify column email_id varchar(30)");

		preparedStatement_6.executeUpdate();

		System.out.println("1 row affected");

		//c. Insert 2 records and check.
		PreparedStatement preparedStatement_7 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id6 = 6;
		String name_6 = "Ajay";
		String email_6 = "ajay@greatlearning.com";
		String Phone_6 = "4444444444";

		preparedStatement_7.setInt(1, id6);
		preparedStatement_7.setString(2, name_6);
		preparedStatement_7.setString(3, email_6);
		preparedStatement_7.setString(4, Phone_6);

		int rowCount6 = preparedStatement_7.executeUpdate();
		System.out.println(rowCount6 + " Row inserted");

		PreparedStatement preparedStatement_8 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id7 = 7;
		String name_7 = "Kumar";
		String email_7 = "kumar@greatlearning.com";
		String Phone_7 = "3333333333";

		preparedStatement_8.setInt(1, id7);
		preparedStatement_8.setString(2, name_7);
		preparedStatement_8.setString(3, email_7);
		preparedStatement_8.setString(4, Phone_7);

		int rowCount7 = preparedStatement_8.executeUpdate();
		System.out.println(rowCount7 + " Row inserted");


		//d. Update the name of employee Id 3 to Karthik and phone number to 1234567890.
		PreparedStatement preparedStatement_9 = conn.prepareStatement("update table set name = ? and phone_number = ? where id = ?");
		String name_8 = "Karthik";
		String phone_8 = "1234567890";
		int id_8 = 3;

		preparedStatement_9.setString(1, name_8);
		preparedStatement_9.setString(2, phone_8);
		preparedStatement_9.setInt(3, id_8);
		int rowCount8 = preparedStatement_9.executeUpdate();

		System.out.println(rowCount8 + " row affected");

		//e. Delete employee records 3 and 4.
		PreparedStatement preparedStatement_10 = conn.prepareStatement("Delete from employee where id = 3 and 4");

		preparedStatement_10.executeUpdate();

		System.out.println("1 row affected");

		//f. Remove all records from the table employee
		PreparedStatement pstmt10 = conn.prepareStatement("truncate table employee");

		pstmt10.executeQuery();
		System.out.println("All rows affected!");
		preparedStatement_1.close();
		preparedStatement_2.close();
		preparedStatement_3.close();
		preparedStatement_4.close();
		preparedStatement_5.close();
		preparedStatement_6.close();
		preparedStatement_7.close();
		preparedStatement_8.close();
		preparedStatement_9.close();
		preparedStatement_10.close();
		conn.close();
	}

}
