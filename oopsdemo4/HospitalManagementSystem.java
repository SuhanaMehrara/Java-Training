package oopsdemo4;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 12:56:16 PM
 * Email  : Vishal.1.Chauhan@coforge.com
 * Concrete subclass for Administrative Staff
 */

public class HospitalManagementSystem {

	public static void main(String[] args) {
		// Create different types of hospital staff
		Doctor doctor = new Doctor("Dr. Smith", "DOC123", "Cardiology", "Cardiologist");
		Nurse nurse = new Nurse("Nurse Johnson", "NUR456", "Emergency", 8);
		AdminStaff admin = new AdminStaff("Mr. Davis", "ADM789", "Administration", "Billing");

		// Demonstrate polymorphic behavior
		HospitalStaff[] staffMembers = {doctor, nurse, admin};

		for (HospitalStaff staff : staffMembers) {
			System.out.println("\n--- " + staff.getName() + " (" + staff.getId() + ") ---");
			staff.performDuties();  // Calls the appropriate implementation
			staff.attendMeeting();  // Uses the inherited method

			// Additional role-specific methods
			if (staff instanceof Doctor) {
				((Doctor) staff).prescribeMedication();
			} else if (staff instanceof Nurse) {
				((Nurse) staff).administerMedication();
			} else if (staff instanceof AdminStaff) {
				((AdminStaff) staff).processPaperwork();
			}
		}


	}

}
