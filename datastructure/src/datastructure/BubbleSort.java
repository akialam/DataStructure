package datastructure;

public class BubbleSort {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,6,3,8,4,1,6};
		int len=arr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+",");
		}

	}

}
