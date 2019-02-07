package datastructure;

public class Insertionsort {

	void sort(int[] arr)
	{
		int len=arr.length;
		int i,j;
		for( i=0;i<len-1;i++)
		{
			for(j=i+1;j>0;j--)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		for (int k : arr) {
			System.out.println(k);
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertionsort is=new Insertionsort();
		int[] arr= {5,1,4,3,6,7,2};
		is.sort(arr);
		
	}

}
