package oopsdemo4;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 12:43:54 PM
 * Email  : Vishal.1.Chauhan@coforge.com
 */

// Concrete subclass for Doctors
public class Doctor extends HospitalStaff {
	private String specialization;

	public Doctor(String name, String id, String department, String specialization) {
		super(name, id, department);
		this.specialization = specialization;
	}

	@Override
	public void performDuties() {

		System.out.println(getName() + " is examining patients in the " + 
				getDepartment() + " department (" + specialization + ").");

	}
	
	 public void prescribeMedication() {
	        System.out.println(getName() + " is writing a prescription.");
	    }




}
