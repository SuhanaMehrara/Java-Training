package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 4:01:19 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Employee1 {
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }

}
