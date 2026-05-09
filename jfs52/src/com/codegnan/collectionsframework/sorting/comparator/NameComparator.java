package com.codegnan.collectionsframework.sorting.comparator;

import java.util.Comparator;

public class NameComparator  implements Comparator<Employee> {
	
	//Sort by Employee name
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);	
	}

}
