package test.com;

public class AddNRemoveDataInlinkedList {

	public static void main(String[] args) {

		LinkedListMY ll = new LinkedListMY();
		
		ll.addNewNode(10);
		ll.addNewNode(11);
		ll.addNewNode(10);
		ll.addNewNode(12);
		ll.addNewNode(12);
		ll.addNewNode(13);

		ll.display();
		
		/*Linkedlst ll = new Linkedlst();
		
		ll.push(12);
		ll.push(10);
		ll.push(10);
		ll.push(12);
		ll.push(12);
		ll.push(13);

		ll.printList();*/
		
	}

}
