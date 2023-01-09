package week3.day2.Assignment4;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Info with ID: "+ id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("\nStudent Info with Name: "+ name+ "\n"+"Student Info with ID: "+ id);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("\nStudent Info with EMail: "+ email+ "\n"+"Student Info with Phone Number: "+ phoneNumber);
	}

	public static void main(String[] args) {
		Students stud1 = new Students();
		
		stud1.getStudentInfo(1223);
		stud1.getStudentInfo(1223, "Vimalan");
		stud1.getStudentInfo("vimalan.sekar.v1@gmail.com", 8362859382l);
	}
}
