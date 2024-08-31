


public class ReverseWordString {

	public static void main(String[] args) {
		
		//1
		String str="Welcom to Selenium";
		
		String[] words= str.split(" "); //splitting string
		
		String reverstr="";
		
		for(String s:words)
		{
			String reversword="";
			
			for(int i=s.length()-1;i>=0;i--) //welcome
			{
				reversword=reversword+s.charAt(i);
			}
			
			reverstr=reverstr+reversword+" "; //emoclew ot umineles
		}
		
		System.out.println("Reverse string is: "+reverstr);
		
		
		//2
		
		String str1="Welcom to Selenium";
		String[] words1=str.split(" ");
		
		String reversstr="";
		
		for(String s:words1)
		{
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			reversstr=reversstr+sb.toString()+" ";
		}
		
		System.out.println("Reverse word is the String: "+reversstr);

	}

}
