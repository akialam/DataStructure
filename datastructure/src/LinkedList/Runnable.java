package LinkedList;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new List();
		l.insert(12);
		l.insert(5);
		l.insert(23);
		l.insertHead(10);
		l.insertAt(0, 60);
		l.deleteAt(1);
		l.insert(2,90);
		l.show();
		
		
	}

}
