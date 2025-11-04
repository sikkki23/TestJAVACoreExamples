package test.com;

public class LinkedListMY {
	
	Node start;

	
	public void display()
	{
		Node p = start;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.link;
		}
	}
	
	public void addNewNode(int num)
	{
		Node n = new Node(num);
		n.link=start;
		start=n;
		
	}
	
	public int countNode()
	{
		Node p = start;
		int size=0;
		while(p!=null)
		{
			size++;
			p=p.link;
		}
		return size;
		
	}
	
	
	
	
	
}
