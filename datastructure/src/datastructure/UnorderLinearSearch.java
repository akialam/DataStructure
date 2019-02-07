package datastructure;

public class UnorderLinearSearch {

	
	void insertionsort(int[] arr)
	{
		int len=arr.length;
		int i,j;
		
		for(i=1;i<len;i++)
		{
		 j=i-1;
		 int key=arr[i];
		 while(j>=0&&arr[j]>key)
		 {
			arr[j+1]=arr[j];
			j=j-1;
		 }
		 arr[j+1]=key;
		}
		
		
		int[] sort=new int[len];
		int m=0;
		for (int k : arr) {
			//System.out.print(k+",");
			sort[m]=k;
			m++;
		}
		System.out.print("sorted Arrya:-");
		for (int k : sort) {
			
			System.out.print(k+",");
		}
		System.out.println("");
		int num=20;
		binearySearch(sort,num);
	}
	
	void binearySearch(int[] arr,int num )
	{
		int low=0;
		int high=arr.length;
		while(low<=high)
		{
		int middle=(low+high+1)/2;
		
		if(arr[middle]==num)
		{
			System.out.println("searched Element:-"+arr[middle]);
			break;
		}
		else if(arr[middle]>num)
		{
			high=middle;
			
		}
		else if(arr[middle]<num)
		{
			low=middle;
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnorderLinearSearch us=new UnorderLinearSearch();
		int[] arr= {10,2,56,36,20,3,5,9};
		us.insertionsort(arr);
		
		
		
	}

}
