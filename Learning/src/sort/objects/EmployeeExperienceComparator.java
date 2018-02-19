package sort.objects;

import java.util.Comparator;

public class EmployeeExperienceComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDoj().compareTo(o2.getDoj());
	}

}
