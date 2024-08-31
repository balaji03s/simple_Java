
public class MissingNuminArray {

	public static void main(String[] args) {
		
		//Array should not have duplicate
				//Array no need to be sorted order
				//values should be in range
				
				int a[]= {1,2,4,5};
				
				int sum1=0;
				for (int i=0;i<a.length;i++)
				{
					sum1=sum1+a[i];
				}
				System.out.println("Sum of element: "+sum1);
				
				int sum2=0;
				for(int i=1;i<=5;i++)
				{
					sum2=sum2+i;
				}
				
				System.out.println("Sum of Total elements:" +sum2);
				
				System.out.println("Missing number: "+(sum2-sum1));
	}

}
