
public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,30,60};
		int search=20;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			
			if(search==a[i])
			{
				System.out.println("Element found:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
		System.out.println("Element not found");
		}
	}

}
