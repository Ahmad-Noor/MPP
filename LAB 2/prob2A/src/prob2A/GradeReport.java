package prob2A;

public class GradeReport {
	private Student student;
	private String grade;

	GradeReport(Student student, String grade) {
		this.student = student;
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public Student getStudent() {
		return student;
	}
	
	@Override
	public String toString() {
		return "Grade : " + grade;
	}
}
