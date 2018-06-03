import java.util.*;
import java.lang.*;

public class MySet
{
    private int[] element;
    private int cardinality;
    private int size;

    public MySet()
    {
	this.element = new int[0];
	this.cardinality = 0;
    }
    
    public MySet(int[] arr)
    {
    	size = sizeOfUniqueArr(arr);
    	this.element = new int[size];
    	this.cardinality = 0;
	unique(arr);
    }
    
    private int sizeOfUniqueArr(int[] arr)
    {
    	int size = arr.length;
    	for(int i = 1; i < arr.length; i++)
    	{
    		for(int j = 0; j < i; j++)
    		{
    			if(arr[j] == arr[i])
    				size--;
    		}
    	}
    	
    	return size;
    }

    private void unique(int[] arr) 
    {
    	int x = 0;
	this.element[x++] = arr[0];
	int flag;
	for(int i = 1; i < arr.length; i++)
	{
	    flag = 0;

	    for(int j = 0; j < i; j++)
	    {
    		if(arr[j] == arr[i])
    		{
    		    flag = 1;
    		    j = i;
    		}
	    }

	    if(flag == 0)
	    {
		    this.element[x++] = arr[i];
	    }
	}
    }
    
    public int getCardinality()
    {
	   return this.size;
    }
    
    public boolean isElementinTheSet(int x)
    {
    	for(int i = 0; i < this.size; i++)
    	{
    		if(x == this.element[i])
    			return true;
    	}
    	
    	return false;
    }
    
    public MySet(MySet a, MySet b)
    {
    	this.size = sizeOfUnionSet(a, b);
    	this.element = new int[size];
    	union(a, b);
    }
    
    public int sizeOfUnionSet(MySet a, MySet b)
    {
    	int size = a.element.length + b.element.length;
    	for(int i = 0; i < a.element.length; i++)
    	{
    		for(int j = 0; j < b.element.length; j++)
    		{
    			if(a.element[i] == b.element[j])
    				size--;
    		}
    	}  	
    	
    	return size;
    }
    
    private void union(MySet a, MySet b)
    {
    	int flag;
    	int x = 0;
    	
    	for(int i = 0; i < a.element.length; i++)
    		this.element[x++] = a.element[i];
    		
    	for(int i = 0; i < b.element.length; i++)
    	{
    		flag = 0;
    		for(int j = 0; j < a.element.length; j++)
    		{
    			if(a.element[j] == b.element[i])
    			{
    				flag = 1;
    				j = a.element.length;
    			}
    		}
    		
    		if(flag == 0)
    			this.element[x++] = b.element[i];	
    	}  	
    }

    public String toString()
    {
	String str = "{";
	for(int i = 0; i < this.size; i++)
	{
	    str = str + this.element[i] +", ";
	}
	str += "}";
	return str;
    }
    
}
