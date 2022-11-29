package ExamQuestions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class FetchQuestions  {
   int count;
   int student;
   String firstName;
   String LastName;
  public static void main(String[] args) {
	

	   FetchQuestions q=new FetchQuestions();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student firstName");
		String firstName=sc.next();
		System.out.println("Enter the Students LastName");
		String LastName=sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","rutu");
			PreparedStatement ps=con.prepareStatement("select * from question");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.print(rs.getString(1));
				System.out.println(") "+rs.getString(2));
				System.out.println("a) "+rs.getString(3));
				System.out.println("b) "+rs.getString(4));
				System.out.println("c) "+rs.getString(5));
				System.out.println("d) "+rs.getString(6));
				String correctAns=rs.getString(7); 
				Scanner scan= new Scanner(System.in);
				
				System.out.println("enter the correct Answer");
				String Ans=scan.next();
				if(Ans.equalsIgnoreCase(correctAns)) {
				  q.count=q.count+1;
				 }else {
		            }
            }
			System.out.println("optained marks of Students is = "+q.count);
			System.out.println("Students score stored in database succsesfully");
			con.close();
			ps.close();
			rs.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","rutu");
			PreparedStatement ps2=con2.prepareStatement("insert into score(grades,score)values(?,?)");
			
			    if(q.count>8 && q.count<=10) {
			    	ps2.setString(1,"A");
			    	ps2.setObject(2, q.count);
			    }else {
			    
			    if(q.count>=6 && q.count<=8) {
			    	ps2.setString(1, "B");
			    	ps2.setObject(2, q.count);
			    }else {
			    	if(q.count==5) {
			    		ps2.setString(1, "c");
			    		ps2.setObject(2, q.count);
			    	}else{
			    		if(q.count<5) {
			    			ps2.setString(1, "D");
			    			ps2.setString(2,"fail");
			    		}
			    	}
			    }
			    }
			int i=ps2.executeUpdate();
			con2.close();
			ps2.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		       }
	
	}
	  	
	}
}
