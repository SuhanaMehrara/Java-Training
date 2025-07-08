package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 4:02:23 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// create array of Employee Object
				Employee1[] obj=new Employee1[5];
				
				// create actual Employee Object
				for(int i=0;i<5;i++)
				{
					obj[i]=new Employee1();
				}
				
				// assign data to employee Objects
				obj[0].setData(100,"Pikachu");
				obj[1].setData(101,"PowerRangers");
				obj[2].setData(102,"Ben10");
				obj[3].setData(103,"Shinchan");
				obj[4].setData(104,"Mitsy");
				
				// display employ Object data
				System.out.println("*********** Employee Details ***********");
				for(int i=0;i<5;i++)
				{
					obj[i].showData();
				}
				System.out.println("****************************************");

	}
}
