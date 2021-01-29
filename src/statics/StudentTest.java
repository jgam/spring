package statics;

public class StudentTest {
	public static void main(String[] args) {
		Student Jimmy = new Student("Jimmy" );
		System.out.println(Student.serialNum+","+ Jimmy.studentID);
		
		Student Jamie = new Student("Jamie");
		System.out.println(Student.serialNum+","+ Jimmy.studentID+","+Jamie.studentID);
	}
}
