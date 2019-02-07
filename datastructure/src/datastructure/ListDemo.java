package datastructure;

import java.util.*; 

public class ListDemo 
{ 
	
	static List<Integer> oddNumber(int l,int r)
	{
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=l;i<=r;i++)
		{
			if(i%2!=0)
			{
				arr.add(i);
			}
		}
		return arr;
	}
    public static void main (String[] args) 
    { 
        // Creating a list 
      //  List<Integer> l1 = new ArrayList<Integer>(); 
      List<Integer> l=  ListDemo.oddNumber(3, 9);
      System.out.println(l);
        
  
        
    } 
} 