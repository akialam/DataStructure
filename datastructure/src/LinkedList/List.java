package LinkedList;

public class List {

	Node head;
	void insert(int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
					
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			 n.next=node;
			 
		}
		
		
	}
	void insertHead(int data)
	{
		Node n=new Node();
		n.data=data;
		n.next=null;
		n.next=head;
		head=n;
				
	}
	void insertAt(int index,int data)
	{
		Node n=new Node();
		n.data=data;
		n.next=null;
		Node temp=head;
		if(index==0)
		{
			insertHead(data);
		}
		else
		{
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
		}
	}
	void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		Node n=null;
		n=temp.next;
		temp.next=n.next;
		//n.next=null;
	}
	}
	
	void show()
	{
		Node n=head;
		int l=0;
		if(head==null)
		{
			System.out.println(l+" list");
		}
		else
		{
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
			l++;
		}
		System.out.println(n.data);
		System.out.println(l+1);
		}
	}
}
