package extPackage;
import prob2A.*;

public class main {

	public static void main(String[] args) {
		Student student = new Student("Joe", "A");
		GradeReport gr = student.getGradeReport();
		System.out.println(student + " " + gr);
		System.out.println("student of grade: " + gr.getStudent());
	}

}
