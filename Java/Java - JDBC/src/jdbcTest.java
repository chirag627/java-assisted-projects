import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcTest {
	private static Connection connection;
	private static Statement statement;

	public static void main(String[] args) throws SQLException {
		System.out.println("1. Read the data");
		System.out.println("2. Write the data");
		System.out.println("3. Update the data");
		System.out.println("4. Delete the data");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			readDB();
			break;
		
		case 2:
			writeDB();
			break;
			
		case 3: 
			updateDB();
			break;
			
		case 4:
			deleteDB();
		break;
		}
	}

	private static void readDB() throws SQLException {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "toor");
			 statement = connection.createStatement();
			ResultSet ResultSet = statement.executeQuery("Select * from account");
			while (ResultSet.next()) {
				System.out.println(ResultSet.getInt("accno") + " " + ResultSet.getString("firstname") + " "
						+ ResultSet.getString("lastname") + " " + ResultSet.getString("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	private static void writeDB() throws SQLException {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "toor");
			 statement = connection.createStatement();
			int rowsInserted =statement.executeUpdate("insert into account values(3,'Agarwal','Sujal',1000)");
			System.out.println("Rows Inserted: "+ rowsInserted);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	
	private static void updateDB() throws SQLException {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "toor");
			 statement = connection.createStatement();
			int rowsUpdated =statement.executeUpdate("update account set balance=10000000 where accno = 2");
			System.out.println("Rows updated: "+rowsUpdated);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	
	private static void deleteDB() throws SQLException {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "toor");
			 statement = connection.createStatement();
			int rowsDeleted =statement.executeUpdate("delete from account where accno = 2");
			System.out.println("Rows Deleted: "+rowsDeleted);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement.close();
			connection.close();
		}
	}

}