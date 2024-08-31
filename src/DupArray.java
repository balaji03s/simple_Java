


public class DupArray {
 
	public static void main(String[] args) {
		
       String arr[]= {"java","C","C++","Python","java","C"};
		
		//1
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element:"+arr[i]);
				}
			}
		
		}
	}
	

}
