package arraysdemo;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int grades[]={16,25,0,19,22,44,111,61,71};

	        System.out.println("Original Array Contents :"+ Arrays.toString(grades));

	        // In-Place Reversal of Array
	        //Swap first element with last element, second element with second last element,
	        // until we reach the middle of Array
	        for (int i = 0; i < grades.length/2; i++) {
	            //swap elements
	            int temp=grades[i];
	            grades[i]=grades[grades.length-i-1];
	            grades[grades.length-i-1]=temp;
	        }
	        System.out.println("Reverse Array contents : "+Arrays.toString(grades));

	        System.out.println("********** Using Collections.reverse() Method *************");
	        String[] students={"Mark","Bill","Lucy","James","Chloe"};
	        System.out.println("Original Array:"+Arrays.toString(students));

	        Collections.reverse(Arrays.asList(students));
	        System.out.println("Reversed Array:"+Arrays.toString(students));
	}

}
