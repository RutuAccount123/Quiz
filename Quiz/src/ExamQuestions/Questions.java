package ExamQuestions;

import java.sql.Connection;

		import java.sql.DriverManager;

		import java.sql.Statement;

		public class Questions {

			public static void main(String[] args) {
				
			
			 
				try {
			     Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","rutu");
					Statement s=con.createStatement();
					//s.execute("create table question(no varchar(50),questions varchar(200),optionA varchar(200),optionB varchar(200), optionC varchar(200),optionD varchar(200),correctAns varchar(200))");
				//	s.execute("create table score(students int(50) not null auto_increment,grades varchar(200),score varchar(200),primary key (students))");
				    s.execute("truncate table question");
					System.out.println("create the questions table");	
					con.close();
					s.close();
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				

			}

			}
		
		
		


