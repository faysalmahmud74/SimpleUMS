import java.lang.*;
import java.util.*;
import classes.*;

public class Start{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		Portal p = new Portal();
		
		System.out.println("***Welcome to University portal***");
		
		boolean repeat=true;
		while(repeat){
			System.out.println("Choose a option:");
			System.out.println("1. Teacher's Portal");
			System.out.println("2. Student's Portal");
			System.out.println("3. Exit");
			
			System.out.println("Choose a option from below:");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
				System.out.println("Welcome to Teacher portal");
				
				System.out.println("1. Add Teacher");
				System.out.println("2. Search course teacher");
				System.out.println("3. Exit");
				
				System.out.println("Choose a option from below:");
				int choice1 = sc.nextInt();
				
				switch(choice1){
					case 1:
					System.out.println("Provide necessary information to add teacher:");
					System.out.println("Techer name:");
					String teacherName1 = sc.next();
					System.out.println("Teacher ID:");
					String teacherId1 = sc.next();
					System.out.println(" Provide the course s/he takes:");
					String teacherCourse1 = sc.next();
					
					Teacher t1 = new Teacher (teacherName1, teacherId1, teacherCourse1);
					
					if(p.addTeacher(t1)){
						System.out.println("Action successfull");
					System.out.println("Added Techer name:" + teacherName1+ " Id:" + teacherId1+ " Course:" + teacherCourse1+ "has been added");
					}
					else{
						System.out.println("Error occured!");
						}
						break;
						case 2:
						System.out.println("***Welcome to teacher server***");
						System.out.println(" Provide teacher Id:");
						String teacherId2 = sc.next();
						Teacher t2 = p.searchTeacher(teacherId2);
						if(t2 !=null){
							System.out.println("Teacher information is given below:");
							System.out.println("Techer Name:" +t2.getTeacherName());
							System.out.println("Course s/he takes:" +t2.getTeacherCourse());
						}
						else{
							System.out.println("Invalid information!");
						}
						break;
						case 3:
						System.out.println("Session expired");
						System.out.println("Exited");
						break;
						default :
						System.out.println("Exception occured or Invalid input!");
						break;
				}
				break;
				case 2:
				System.out.println("Welcome to student portal:");
				
				System.out.println("1. Add Student");
				System.out.println("2. Remove Student");
				System.out.println("3. Show Student Inventory");
				System.out.println("4. Exit");
				
				System.out.println("Choose a option from below");
				int choice2 = sc.nextInt();
				
				switch(choice2){
					case 1:
					System.out.println("Provide necessary information to add a student:");
					System.out.println("Student name:");
					String studentName1 = sc.next();
					System.out.println("Student ID:");
					String studentId1 = sc.next();
					
					Student s1 = new Student(studentName1, studentId1);
					
					if(p.addStudent(s1)){
						System.out.println("Student name:" +studentName1+ " Id:"+studentId1+ "added sucessfully");
						//Syatem.out.println("Added sucessfully");
					}
					else{
						System.out.println("Error occured!");
					}
					break;
					case 2:
					System.out.println ("Provide the information below to remove a Student");
					System.out.println("Student ID:");
					String studentId2 = sc.next();
					
					Student s2 = p.searchStudent(studentId2);
					
					if(s2 !=null){
						if(p.removeStudent(s2)){
							System.out.println("Student Id:" +studentId2+ "has been removed.");
						}
						else{
							System.out.println("Error Occured!");
						}
					}
					else{
						System.out.println("There is no registed student with this id");
					}
					break;
					case 3:
					System.out.println("***Welcome to student inventory***");
					p.showAllStudent();
					break;
					case 4:
					System.out.println("Session expired");
					System.out.println("Exited");
					break;
					default :
					System.out.println("Exception occured or Invalid input!");
					break;
				}
				break;
				case 3:
				repeat = false;
				System.out.println("***Exited***");
				break;
				default :
				System.out.println("Exception occured or Invalid input!");
				
			}
			
		}
		
	}
}