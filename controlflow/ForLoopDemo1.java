package controlflow;

public class ForLoopDemo1 {
	public static void main(String[] args)
	{
		System.out.println("Display 1- 10");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Display 10- 1");
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Display 10 times name");
		for(int i=1;i<=10;i++)
		{
			System.out.println("James Gosling");
		}
		System.out.println();
	}

}
