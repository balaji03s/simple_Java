
public class EvenandOddArray {

	public static void main(String[] args) {
		
        int a[]= {1,2,3,4,5,6,8,9,10};
		
		//Extracting event number
		System.out.println("Event number");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]);
		}
		
		System.out.println("Odd number");
		for (int i=0;i<a.length;i++)
		{
			
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
	}

