

public class CountChrString {

	public static void main(String[] args) {
		
		String s="Java Programming Java oops";
		int total_count=s.length();
		int total_after=s.replace("a", "").length(); //after removing a
		
		int count=total_count-total_after;
		System.out.println("Number occurances of is: "+total_count);
	}

}
