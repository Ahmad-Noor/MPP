package personJob;

public class PersonWithJob {
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(double s) {
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public static void main(String[] args) {
		PersonWithJob pwj1 = new PersonWithJob(30000);
		Person p1 = new Person("Joe", pwj1);
		
		PersonWithJob pwj2 = new PersonWithJob(30000);
		Person p2 = new Person("Joe", pwj2);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		
//		compare 2 instances of PersonWithJob
		System.out.println("pwj1.equals(pwj2)? " + pwj1.equals(pwj2));
		System.out.println("pwj2.equals(pwj1)? " + pwj2.equals(pwj1));
	}


}
