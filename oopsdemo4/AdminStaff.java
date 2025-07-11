package oopsdemo4;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 12:51:39 PM
 * Email  : Vishal.1.Chauhan@coforge.com
 * Concrete subclass for Administrative Staff
 */

public class AdminStaff extends HospitalStaff {
	private String role;

	public AdminStaff(String name, String id, String department, String role) {
		super(name, id, department);
		this.role = role;
	}

	@Override
	public void performDuties() {

		System.out.println(getName() + " is performing " + role + 
				" tasks in the " + getDepartment() + " department.");
	}

	public void processPaperwork() {
		System.out.println(getName() + " is processing hospital paperwork.");
	}


}
