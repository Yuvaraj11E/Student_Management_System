package KIT.std;
import  java.util.Scanner;
public class Main 
{
	public static void main(String []args)
	{
		StudentService service = new StudentService();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n--- Student Management System---");
			System.out.println("1.Add Student");
			System.out.println("2.View Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice)
			{
			case 1 -> {
				System.out.println("Enter ID:");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter name:");
				String name=scanner.nextLine();
				System.out.println("Enter course:");
				String course=scanner.nextLine();
				service.addStudent(new Student(id,name,course));
			}
			case 2 -> service.viewStudents();
			case 3 ->{
				System.out.println("Enter ID to update:");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter new name:");
				String newName=scanner.nextLine();
				System.out.println("Enter new course:");
				String newCourse=scanner.nextLine();
				service.update(id, newName, newCourse);
			}
			case 4 ->{
				System.out.println("Enter ID to delete");
				int id=scanner.nextInt();
				service.deleteStudent(id);
			}
			case 0 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid Choice.");
			}
		}while (choice !=0);
		
	}

}

