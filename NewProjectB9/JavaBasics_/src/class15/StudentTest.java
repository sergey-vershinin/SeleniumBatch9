package class15;

public class StudentTest {
	public static void main(String[] args) {
		
		Student Stud = new Student();
		Stud.name = "Seregy";
		Stud.age = 34;
		Stud.studentId = "SV11";
		Stud.schoolName = "CUNY";
		Stud.study();
		Stud.payTuition();
		
		Student Stud2 = new Student();
		Stud2.name = "Alex";
		Stud2.age = 30;
		Stud2.studentId = "al23";
		Stud2.schoolName = "Syntax";
		Stud2.study();
		Stud2.payTuition();
		
		Stud.getStudentAge();
	}

}
