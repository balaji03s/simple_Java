
public class PalindromNum {

	public static void main(String[] args) {
		
		int num=12, rev=0;
		int orig=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orig==rev)
		{
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}


