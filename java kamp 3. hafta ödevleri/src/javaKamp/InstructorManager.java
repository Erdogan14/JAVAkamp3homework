package javaKamp;

public class InstructorManager extends UserManager {
	
	public void addPhone(Instructor instructor) {
		System.out.println(instructor.getName()+" " +instructor.getLastName()+" adlý kiþi sisteme" 
									+" ("+ instructor.getPhoneNumber()+") "+"telefon numarasýný eklemiþtir." );
	}
	
	public void addEmail(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastName()+" adlý kiþi sisteme" 
									+" ("+ instructor.getEmail()+") "+"email adresini eklemiþtir." );
	}
}
