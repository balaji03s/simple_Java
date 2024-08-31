import java.util.Arrays;
import java.util.Collections;

public class SortingElement {

	public static void main(String[] args) {
		
		int a[]= {30,50,20,10,60};
		System.out.println("Array element before sorthing: "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Array element after sorthing1: "+Arrays.toString(a));
		
		//2
		Arrays.sort(a);
		System.out.println("Array element after sorthing2: "+Arrays.toString(a));
		
		//3 Reverse sort
		Integer a1[]={30,50,20,10,60};
		Arrays.sort(a1, Collections.reverseOrder());
		System.out.println("Array element reverse sorthing: "+Arrays.toString(a1));
	}

}
