package classes;
import java.lang.*;

public class Student{
	
	private String studentName;
	private String studentId;
	
public Student (){};
public Student ( String studentName,String studentId){
	
	this.studentName=studentName;
	this.studentId=studentId;
}

public void setStudentName(String studentName)
{this.studentName=studentName;}

public String getStudentName ()
{return studentName;}	
	
public void setStudentId(String studentId)
{this.studentId=studentId;}

public String getStudentId()
{return studentId;}

}