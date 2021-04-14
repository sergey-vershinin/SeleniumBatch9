package class15;

public class Student {
		String name;
		int age;
		String studentId;
		String schoolName;
		void study() {
			System.out.println(name+ " studies in " + schoolName); 
			
		}
		void payTuition() {
			System.out.println(name+" need to pay a tuition");
		}
		
		int getStudentAge() {
			System.out.println(age);
			return age;
		}
		
}
