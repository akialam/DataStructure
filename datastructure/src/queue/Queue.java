package queue;

public class Queue {

	
	int capacity=5;
	int[] queue=new int[capacity];
	int size;
	int rear;
	int front;
	
	void enqueue(int data)
	{
		queue[rear]=data;
		rear =(rear+1)%capacity;
		size++;
		
	}
	int dequeue()
	{
		int tm=queue[front];
		//System.out.println("hello "+tm);
		front=(front+1)%capacity;
		size--;
		return tm;
	}
	
	void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%capacity]+",");
			//System.out.println("");
		}
		System.out.println();


		
	}
}
