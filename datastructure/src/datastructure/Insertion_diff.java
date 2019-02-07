package datastructure;

public class Insertion_diff {

	void sort(int[] arr)
	{
		int len=arr.length;
		int i,j,v;
		for(i=2;i<=len-1;i++)
		{
			v=arr[i];
			j=i;
			while(arr[j-1]>v && j>=1)
			{
				arr[j]=arr[j-1];
				j--;
				
			}
			arr[j]=v;
		}
		for (int k : arr) {
			System.out.println(k);
		}
	}

	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			Insertion_diff is=new Insertion_diff();
			int[] arr= {5,1,4,3,6,7,2};
			is.sort(arr);
			

	}

}
