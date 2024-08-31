

public class RemovehiteSpaces {

	public static void main(String[] args) {
		
		String s="Java      selenium with          automation in capgemini";
		s=s.replaceAll("\\s", "");
		System.out.println("After removeing the spaces:"+s);
	}

}
