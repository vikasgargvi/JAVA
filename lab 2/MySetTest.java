import java.util.*;
import java.lang.*;

public class MySetTest
{
    public static void main(String[] args)
    {
	int[] arr1 = new int[] {23, 45, 56, 23, 45, 17, 27, 27, 10, 9, 9};
	int[] arr2 = new int[] {1, 2, 56, 55, 45, 22, 9, 6, 4, 4, 56};

	MySet set1 = new MySet(arr1);
	System.out.println("Unique Set1 : "+ set1 +"\nSize is: "+ set1.getCardinality());
	
	MySet set2 = new MySet(arr2);
	System.out.println("Unique Set2 : "+ set2 +"\nSize is: "+ set2.getCardinality());
	
	MySet uni = new MySet(set1, set2);
	System.out.println("Union Set : "+ uni +"\nSize is: "+ uni.getCardinality());
	
	Scanner ser = new Scanner(System.in);
	System.out.println("search Element: ");
	int x = ser.nextInt();
	System.out.println("Element "+ x +" present in a union set? "+ uni.isElementinTheSet(x));
	
    }
}
