package controlflow;

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weeks = 3, days = 7, i = 1;
		
		while(i <= weeks)
		{
			System.out.println("Week :"+i);
			for(int j = 1; j <= days; ++j)
			{
				System.out.println("\t"+"Day :"+j);
			}
			i = i + 1;
		}
	}

}
