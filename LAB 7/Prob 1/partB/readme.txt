	error in !inList(e, l2))  must check in each element on l2
	
	
	public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
		if (l1.size() != l2.size())
			return false;
		for (Employee e : l1) {
			if (!inList(e, l2)) {
				return false;
			}
		}
		return true;
	}