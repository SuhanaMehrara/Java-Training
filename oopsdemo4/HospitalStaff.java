package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 12:39:06 PM
* Email  : Vishal.1.Chauhan@coforge.com
* Abstract class representing a general Hospital Staff member

*/

public abstract class HospitalStaff {
	
	private String name;
    private String id;
    private String department;
    
	public HospitalStaff(String name, String id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
    
	// Abstract method - must be implemented by subclasses
    public abstract void performDuties();

    // Concrete method - shared by all subclasses
    public void attendMeeting() {
        System.out.println(name + " is attending a hospital meeting.");
    }

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

}
