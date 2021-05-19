package javaKamp;

public class Student extends User {
	private String studentNo;
	private String course;
	
	public Student(int id,String name,String lastName,int age,String studentNo,String course) {
		super(id,name,lastName,age);
		this.studentNo=studentNo;
		this.course=course;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
