import java.util.Scanner;

public class CountheWords {

	public static void main(String[] args) {
		
		/*System.out.println("Enter the String:");
		Scanner sc =new Scanner(System.in);
		
		String s=sc.nextLine();*/
		
		String str="Java is a good language";
		
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of words in a string:" +count);
		
	}
	}


