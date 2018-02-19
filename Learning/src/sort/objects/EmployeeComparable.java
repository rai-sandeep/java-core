package sort.objects;

import java.time.LocalDate;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

	private String name;
	private LocalDate dob;
	private LocalDate doj;
	
	public EmployeeComparable (String name, LocalDate dob, LocalDate doj) {
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		return this.dob.compareTo(o.getDob());
	}
	
}
