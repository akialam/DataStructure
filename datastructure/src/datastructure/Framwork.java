package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Framwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		ArrayList<String> New_list=new ArrayList<>();
		list.add("aaquib");
		list.add("alam");
		list.add("ragib");
		list.add("babar");
		System.out.println(list);
		list.set(2, "danish");
		int len=list.size();
		String s=list.get(1);
		System.out.println(len);
		System.out.println(s);
		System.out.println(list);
		int index=list.indexOf("babar");
		System.out.println(index);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			String st="aaquib";
			System.out.println(itr.next());
			if(list.contains(st))
			{
				System.out.println(st);
			}
		}
		list.remove(1);
		
		list.add("raghib");
		System.out.println(list);

		New_list.addAll(list);
		New_list.add("aaquib");
		New_list.add("danish");
		New_list.add("raghib");
		System.out.println("--"+New_list);
		
		HashSet<String> set=new  HashSet<>();
		for (String string : New_list) {
			set.add(string);
			
		}
	System.out.println("----------------------------");
		System.out.println(set);
		if(set.contains("aaquib"))
		{
			System.out.println("aaquib");
		}
	}

}
