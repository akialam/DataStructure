package datastructure;

public class binarysearch {

	int search(int[]arr,int l,int h,int x)
	{
		
		int mid=l+(h-l)/2;
		if(h>=l)
		{
		if(arr[mid]>x)
		{
			return search(arr, l, mid-1, x);
		}
		else if(arr[mid]<x)
		{
			return search(arr, mid+1, h, x);
		}
		else
		{
			return mid;
		}
		}
	return -1;	
	}
	public static void main(String[] args) {
		binarysearch bs=new binarysearch();
		int[] arr= {1,5,8,9,10,15,25,35,65};
		int len=arr.length;
	int num=	bs.search(arr, 0, len-1, 15);
	
	if(num==-1)
	{
		System.out.println("number not found");
	}
	else
	{
		System.out.println("resultent index is :"+num +" and  number is: "+arr[num]);
	}
	}

}
