import java.util.Scanner;

public class stackInteger
{
    public static void main(String[] args){
	GStack<Integer> s = new GStack<Integer>();

	Scanner inp = new Scanner(System.in);

	System.out.println("Enter the elements...");
	int i = inp.nextInt();
	if(i < 0){
	    System.out.println("No elements in stack");
	    return;
	}

	do{
	    s.push(i);
	    i = inp.nextInt();
	}while(i >= 0);

	System.out.println("\nStack elements are...\n" + s);
	/*do{
	    d = s.pop();
	    System.out.println(d);
	}while(true);*/

    }
}
