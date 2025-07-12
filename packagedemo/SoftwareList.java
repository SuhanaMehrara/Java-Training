package packagedemo;

import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.Database;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 2:50:01 PM
* Email  : Vishal.1.Chauhan@coforge.com
* //java.lang package is by default imported in java Programs
//Classes in lang package : System, String, Object
/**
 * Program to demonstrate import & usage of user-defined Packages
 */

public class SoftwareList {

	public static void main(String[] args) {
		OperatingSystem op1 = new OperatingSystem();
		Database d1 = new Database();
		
		System.out.println("***************** List of operating System from Microsoft ***************");
		op1.listSoftware();
		
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("******************** List of databases from oracle ****************");
		d1.printSoftware();

	}

}
