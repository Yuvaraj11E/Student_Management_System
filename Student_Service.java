package KIT.std;

import java.util.List;
import java.util.ArrayList;
public class StudentService 
{
	private final List<Student> students=new ArrayList<>();
	public void addStudent(Student student)
	{
		students.add(student);
		System.out.println("Student added successfully.");
	}
	public void viewStudents()
	{
		if(students.isEmpty())
		{
			System.out.println("No Students To Display");
		}
		else
		{
			students.forEach(System.out::println);
		}
	}
	public void update(int id, String newName, String newCourse)
	{
		for(Student student : students)
		{
			if(student.getId()==id)
			{
				student.setName(newName);
				student.setCourse(newCourse);
				System.out.println("student updated.");
				return;
			}
		}
		System.out.println("student not found.");
	}
	public void deleteStudent(int id)
	{
		students.removeIf(s->s.getId()==id);
		System.out.println("Student deleted(if exisited).");
	}
	}
