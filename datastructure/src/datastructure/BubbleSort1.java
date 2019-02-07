package datastructure;

public class BubbleSort1 {

	
	void sort(int[] arr)
	{
		int len=arr.length;
		boolean b=true;
		int i;
		for( i=0;i<len && b;i++)
		{ b=false;
			for(int j=0;j<len-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					
				b=true;
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				System.out.println(j+"----"+b);
			}
				System.out.println(b);
		}
			System.out.println(i+"---"+"inner");
		}
		for (int l : arr) {
			System.out.println(l);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort1 bs=new BubbleSort1();
		int[] arr= {5,1,4,3,6,7,2};
		bs.sort(arr);
	}

}
