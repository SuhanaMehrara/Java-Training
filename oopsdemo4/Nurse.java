package oopsdemo4;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 12:48:18 PM
 * Email  : Vishal.1.Chauhan@coforge.com
 * // Concrete subclass for Nurses
 */

public class Nurse extends HospitalStaff {
	private int patientLoad;

	public Nurse(String name, String id, String department, int patientLoad) {
		super(name, id, department);
		this.patientLoad = patientLoad;
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is caring for " + patientLoad + 
				" patients in the " + getDepartment() + " department.");

	}

	public void administerMedication() {
		System.out.println(getName() + " is administering medication to patients.");
	}


}
