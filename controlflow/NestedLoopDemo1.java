package controlflow;

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

}
