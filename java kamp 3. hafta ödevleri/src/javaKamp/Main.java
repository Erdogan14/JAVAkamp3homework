package javaKamp;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Erdoğan","Çiftçi",18,"124578","JAVA");
		Instructor instructor = new Instructor(1,"Engin","Demiroğ",35,"JAVA","25451845484","engindemirog@gmail.com");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		
		userManager.create(instructor);
		userManager.create(student);
		
		instructorManager.addPhone(instructor);
		instructorManager.addEmail(instructor);
		studentManager.addStudent(student);
	}

}
