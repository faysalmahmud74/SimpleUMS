package classes;
import java.lang.*;

public class Teacher{
	
	private String teacherName;
	private String teacherId;
	private String teacherCourse;
	
public Teacher (){};
public Teacher ( String teacherName,String teacherId,String teacherCourse )	{
	
	this.teacherName=teacherName;
	this.teacherId=teacherId;
	this.teacherCourse=teacherCourse;
	
}

public void setTeacherName(String teacherName)
{this.teacherName=teacherName;}

public String getTeacherName ()
{return teacherName;}	
	
public void setTeacherId(String teacherId)
{this.teacherId=teacherId;}

public String getTeacherId()
{return teacherId;} 

public void setTeacherCourse(String teacherCourse)
{this.teacherCourse=teacherCourse;}

public String getTeacherCourse ()
{return teacherCourse;}	
	
	
	
}