package JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcConn2 {
	
	jdbcConn1 conn = new jdbcConn1();
	
	Connection connection = null;
	
	public void insert(String name , String email , String password) {
		
		connection = conn.gConnection();
		
		// statement is used to process query -> statement , preparedStatement , callbackStatement
		try {
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO employee(name,password,email) VALUES(?,?,?)");
			pstmt.setString(1,name);
			pstmt.setString(2,password);
			pstmt.setString(3,email);
			
			int i = pstmt.executeUpdate();
			if( i > 0 ) {
				System.out.println("Inserted Successfully .");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(int Eid , String name , String email , String password) {
		
		connection = conn.gConnection();
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("UPDATE employee SET name=? ,password = ?, email = ?  where id = ?");
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setInt(4, Eid);
			
			int i = pstmt.executeUpdate();
			if( i > 0 ) {
				System.out.println("Updated Successfully .");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(int Eid) {
		connection = conn.gConnection();
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from employee where id = ?");
			
			pstmt.setInt(1,Eid);
			
			int i = pstmt.executeUpdate();
			
			if( i > 0 ) {
				System.out.println("Deleted SUccessfully . ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		jdbcConn2 jc = new jdbcConn2();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Crud operations in Database : ");
			System.out.println(" press 1 for insert ");
			System.out.println(" press 2 for update ");
			System.out.println(" press 3 for delete ");
			System.out.println(" press 4 for exit ");
			System.out.println();
			System.out.println("Enter operation number : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter name : ");
				String name = sc.next();
				System.out.println("Enter email : ");
				String email = sc.next();
				System.out.println("Enter password : ");
				String password = sc.next();
				jc.insert(name, email, password);
				break;
			}
			case 2: {
				System.out.println("Enter name : ");
				String name = sc.next();
				System.out.println("Enter email : ");
				String email = sc.next();
				System.out.println("Enter password : ");
				String password = sc.next();
				System.out.println("Enter id : ");
				int id = sc.nextInt();
				jc.update(id, name, email, password);
				break;
			}
			case 3: {
				System.out.println("Enter id you want to delete : ");
				int id = sc.nextInt();
				jc.delete(id);
				break;
			}
			case 4:{
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}
		
		
		
	}
}
