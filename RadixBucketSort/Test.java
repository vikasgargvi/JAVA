import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		Scanner inp = new Scanner(System.in);
		int ele;
		int eleNum = 0;
	
		System.out.println("Enter the elements of list or -1 to exit");
		do{
			eleNum++;
			System.out.println("Enter Element " + eleNum + ":");
			ele = inp.nextInt();
			if(ele >= 0)
				list.add(ele);

		}while(ele > 0);

		RadixBucketSort s = new RadixBucketSort(list);

		int max = greatestNumber(list);
		int digits = digit(max);

		for(int i = 1; i <= digits; i++)
			s.sortList(i);

		System.out.println("******Sorted List*****\n" + s);
	}

	public static int greatestNumber(ArrayList<Integer> arr)
	{
		int max = 1;
		for(int i = 0; i < arr.size(); i++)
			if(arr.get(i) > max)
				max = arr.get(i);

		return max;
	}

	public static int digit(int max)
	{
		int digits = 0;
		while(max > 0)
		{
			digits++;
			max = max / 10;
		}
		return digits;
	}
}