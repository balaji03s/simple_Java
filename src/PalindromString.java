

public class PalindromString {

	public static void main(String[] args) {
		
		String str="madam", rev="";
		String orig=str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println(rev);
		if(orig.equals(rev))
		{
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}
