package prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;

	public Student(String name, String Grade) {
		this.name = name;
		gradeReport = new GradeReport(this, Grade);
	}

	public String getName() {
		return name;
	}

	public GradeReport getGradeReport() {
		return gradeReport;
	}

	@Override
	public String toString() {
		return "Name : " + name;
	}

}