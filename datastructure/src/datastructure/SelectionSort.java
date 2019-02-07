package datastructure;

import java.util.*;
import java.util.ArrayList;

public class SelectionSort {

	static String getNumber(List<Integer> arr,int n)
	{
		String st="";
		int size=arr.size();
		for(int i=0;i<size;i++)
		{
			int number=arr.get(i);
		if(number==n)
		{
			st="yes";
			break;
		}
		else
		{
			st= "no";
		}
			
		
			
		}
		
		return st;
		
	}
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		//List<Integer> l1 = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		int len=l.size();
		
		String  s=SelectionSort.getNumber(l,3);
	System.out.println(s);
		
	}

}
