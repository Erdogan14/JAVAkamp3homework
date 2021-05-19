package javaKamp;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println(student.getStudentNo()+" no'lu " + student.getName()+" "+student.getLastName()
													+" ad'lı öğrenci sisteme "+student.getCourse()+" dersini eklemiştir.");
	}
}
