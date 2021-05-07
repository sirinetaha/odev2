package inheritance3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
	
		 UserManager user = new UserManager();
		 
		 Student student= new Student();
		 student.firstName="Sirine";
		 student.lastName="Taha";
		 student.eMail="sirine23199@gmail.com";
		 student.CourseName="Yazilim Gelistirici Kampi(Java*React)";
		 student.progressRate=32;
		 user.add(student);
		 
		 StudentManager studentmanager=new StudentManager();
		 studentmanager.add(student);
		 studentmanager.prograsRate(student);
		 
		 InstructorManager instructor1= new InstructorManager();
		 
		 Instructor teacher=new Instructor();
		 teacher.firstName="Engin";
		 teacher.lastName="Demirog";
		 teacher.id=23154;
		 teacher.eMail="EnginDemirog@gmail.com";
		 
		 instructor1.add(teacher);
	}

}
