

public class ReverseString {

	public static void main(String[] args) {
		
		//using sting concatenation operator
				String str="Selenium";
				String rev="";
				
				int len=str.length();
				for(int i=len-1;i>=0;i--)
				{
					rev=rev+str.charAt(i);
				}
				System.out.println(rev);
				
				
				
				StringBuffer sb=new StringBuffer(str);
				System.out.println(sb.reverse());
	}

}
