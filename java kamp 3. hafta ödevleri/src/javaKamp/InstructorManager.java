package javaKamp;

public class InstructorManager extends UserManager {
	
	public void addPhone(Instructor instructor) {
		System.out.println(instructor.getName()+" " +instructor.getLastName()+" adl� ki�i sisteme" 
									+" ("+ instructor.getPhoneNumber()+") "+"telefon numaras�n� eklemi�tir." );
	}
	
	public void addEmail(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastName()+" adl� ki�i sisteme" 
									+" ("+ instructor.getEmail()+") "+"email adresini eklemi�tir." );
	}
}
