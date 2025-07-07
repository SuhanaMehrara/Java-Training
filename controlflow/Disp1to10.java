package controlflow;

public class Disp1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		System.out.println("****** Forward Loop ******");
		while(i <= 10) {
			System.out.println(i + " - James Gosling");
			i++;
		}
		
		System.out.println("****** Reverse Loop ******");
	
		int j = 20;
		
		while(j >= 1) {
			System.out.print(j + "\t");
			j--;
		}
	}

}
