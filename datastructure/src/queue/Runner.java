package queue;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
	  q.enqueue(5);
	  q.enqueue(10);
	  
	 q.enqueue(15);
	 q.enqueue(50);
	  q.enqueue(100);
	  q.show();
	  q.enqueue(7);
	 
	  q.dequeue();
	  //System.out.println(number);
	  q.show();
	  
	
	}

}
