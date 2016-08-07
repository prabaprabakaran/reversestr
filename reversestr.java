

import java.util.Scanner;

public class wordsreverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String n=s.nextLine();
		String [] s1=n.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}
	

}
