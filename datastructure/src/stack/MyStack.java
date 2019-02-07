package stack;

public class MyStack {

	int capacity=5;
	int[] arr=new int[capacity];
	int top=0;
	
	void push(int data)
	{
		if(size()==capacity)
		{
			expand();
		}
		else
		{
		arr[top]=data;
		top++;
		}
	}
	private void expand() {
		int length=size();
		int[] newstack=new  int[length*2];
		System.arraycopy(arr, 0, newstack, 0, length);
		arr=newstack;
		capacity=capacity*2;
		
		
	}
	private void shrink() {
		
		int len=size();
		int[] newstack=new int[len];
		System.arraycopy(arr,0 , newstack, 0, len);
		arr=newstack;
		
	}
	void pop()
	{
		if(size()==(capacity/2))
		{
			shrink();
		}
		else
		{
		top--;
		arr[top]=0;
		}
	}
	int size()
	{
		
		return top;
	}
	void show()
	{
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
}
