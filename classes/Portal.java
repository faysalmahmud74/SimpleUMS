package classes;
import java.lang.*;
import interfaces.*;

public class Portal implements iTeacher, iStudent{
	private Teacher teachers[] = new Teacher[100];
	private Student student[] = new Student[500];

	public boolean addTeacher(Teacher t)
	{
		boolean flag = false;
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == null)
			{
				teachers[i] = t;
				flag = true;
				break;
			}
		}
		return flag;
	}


	public Teacher searchTeacher(String teacherId)
	{

		Teacher t = null;
		
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] != null)
			{
				if(teachers[i].getTeacherId().equals(teacherId))
				{
					t = teachers[i];
					break;
				}
			}
		}
		return t;
	}
	
	public boolean addStudent(Student s)
	{
		boolean flag = false;

		for(int i=0; i<student.length; i++)
		{
			if(student[i]==null)
			{
				student[i]=s;
				flag =  true;
				break;
			}
			else{flag = false;}
		}
		return flag;
	}

	public boolean removeStudent(Student s)
	{
		boolean flag = false;

		for(int i=0; i<student.length ; i++)
		{
			if(student[i]==s)
			{
				student[i]=null;
				flag =  true;
				break;
			}
			else{flag = false;}
		}
		return flag;
	}

	public Student searchStudent(String studentId)
	{
		Student s = null;
		for(int i=0; i<student.length ; i++)
		{
			if(student[i] != null)
			{
				if(student[i].getStudentId().equals(studentId))
				{
					s=student[i];
					break;
				}
			}
		}
		return s;
	}

	public void showAllStudent()
	{
		for(int i = 0; i<student.length; i++)
		{
			if(student[i]!=null)
			{
				System.out.println("Student ID : "+student[i].getStudentId());
				System.out.println("Student Name : "+student[i].getStudentName());
			}
		}
	}
}