package personJob;


public class Person {
	private String name;
	private PersonWithJob personWithJob;
	
	Person(String n, PersonWithJob personWithJob) {
		name = n;
		this.personWithJob = personWithJob;
	}
	
	public String getName() {
		return name;
	}
	
	public PersonWithJob getPersonWithJob() {
		return personWithJob;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}

}
