package datastructure;

public class SelectionSortN {

	void sort(int[] arr)
	{
		int len=arr.length;
		int i,j,min=0;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for (int k : arr) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSortN ss=new SelectionSortN();
		int[] arr= {5,1,4,3,6,7,2};
		ss.sort(arr);

	}

}
