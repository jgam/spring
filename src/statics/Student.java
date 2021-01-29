package statics;

public class Student {
	static int serialNum = 10000;
	
	int studentID;
	String studentName;
	public Student( String stuName) {
		this.studentID = serialNum;
		this.studentName = stuName;
		serialNum++;
	}

}
