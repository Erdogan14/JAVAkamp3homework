package javaKamp;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println(student.getStudentNo()+" no'lu " + student.getName()+" "+student.getLastName()
													+" ad'l� ��renci sisteme "+student.getCourse()+" dersini eklemi�tir.");
	}
}
