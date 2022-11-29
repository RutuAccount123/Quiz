package ExamQuestions;
import java.sql.Array;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.util.ArrayList;

		public class InsertQuestions {

        public static void main(String[] args) {
			
		
				try {
				     Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","rutu");
						
						PreparedStatement ps=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
						
					    
					    ps.setString(1, "1");
					    ps.setString(2, "Number of primitive data types in Java are?");
					    ps.setString(3, "7");
					    ps.setString(4, "8");
					    ps.setString(5, "9");
					    ps.setString(6, "10");
					    ps.setString(7, "b");
					    
						PreparedStatement ps2=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps2.setString(1, "2");
					    ps2.setString(2, "What is the size of float and double in java?");
					    
					    ps2.setString(3, "32 and 64");
					    ps2.setString(4, "32 and 32");
					    ps2.setString(5, "64 and 64");
					    ps2.setString(6, "64 and 32");
					    ps2.setString(7, "a");  

					    
						PreparedStatement ps3=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps3.setString(1, "3");
					    ps3.setString(2, "Automatic type conversion is possible in which of the possible cases?");
					    ps3.setString(3, "byte to int ");
					    ps3.setString(4, "int to long ");
					    ps3.setString(5, "long to int");
					    ps3.setString(6, "short to int");
					    ps3.setString(7, "b");
					    
						PreparedStatement ps4=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps4.setString(1, "4");
					    ps4.setString(2, "Arrays in java are-");
					    ps4.setString(3, "object reference");
					    ps4.setString(4, "object");
					    ps4.setString(5, "primitive Datatypes");
					    ps4.setString(6, "None");
					    ps4.setString(7, "b");
					    
						PreparedStatement ps5=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps5.setString(1, "5");
					    ps5.setString(2, "When is the object created with new keyword?");
					    ps5.setString(3, "At compile time ");
					    ps5.setString(4, "At RunTime");
					    ps5.setString(5, "Depend on the code ");
					    ps5.setString(6, "None");
					    ps5.setString(7, "a");
					    
						PreparedStatement ps6=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps6.setString(1, "6");
					    ps6.setString(2, "Identify the corrected definition of a package");
					    ps6.setString(3, "Package is a collection of editing tools");
					    ps6.setString(4, "Package is a collection of Classes ");
					    ps6.setString(5, "Package is a collection of classes and Interfaces");
					    ps6.setString(6, "Package is a collection of Interfaces");
					    ps6.setString(7, "c");
					    
						PreparedStatement ps7=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps7.setString(1, "7");
					    ps7.setString(2, "In which of the following is toString() method defined?");
					    ps7.setString(3, "java.lang.object");
					    ps7.setString(4, "java.lang.string");
					    ps7.setString(5, "java.lang.util");
					    ps7.setString(6, "None");
					    ps7.setString(7, "a");
					    
						PreparedStatement ps8=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps8.setString(1, "8");
					    ps8.setString(2, "compareTo() returns");
					    ps8.setString(3, "True");
					    ps8.setString(4, "False");
					    ps8.setString(5, "An int value");
					    ps8.setString(6, "None");
					    ps8.setString(7, "c");
					    
						PreparedStatement ps9=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps9.setString(1, "9");
					    ps9.setString(2, "To which of the following does the class string belong to.");
					    ps9.setString(3, "java.lang");
					    ps9.setString(4, "java.awt");
					    ps9.setString(5, "java.applet");
					    ps9.setString(6, "java.string");
					    ps9.setString(7, "a");
					    
						PreparedStatement ps10=con.prepareStatement("insert into question(no,questions,optionA,optionB,optionC,optionD,correctAns)values(?,?,?,?,?,?,?)");
					    ps10.setString(1, "10");
					    ps10.setString(2, "To which of the following does the class string belong to.");
					    ps10.setString(3, "3");
					    ps10.setString(4, "4");
					    ps10.setString(5, "10");
					    ps10.setString(6, "13");
					    ps10.setString(7, "d");   
					    
					    
		                 int i=ps.executeUpdate();
		                 int j=ps2.executeUpdate();
		                 int k=ps3.executeUpdate();
		                 int l=ps4.executeUpdate();
		                 int m=ps5.executeUpdate();
		                 int n=ps6.executeUpdate();
		                 int o=ps7.executeUpdate();
		                 int p=ps8.executeUpdate();
		                 int q=ps9.executeUpdate();
		                 int r=ps10.executeUpdate();
							System.out.println("Store the questions on database");
						con.close();


						ps.close();
						ps2.close();
						ps3.close();
						ps4.close();
						ps5.close();
						ps6.close();
						ps7.close();
						ps8.close();
						ps9.close();
						ps10.close();
		         
						
						
						
						
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					

				}
			}


		