package test.com;

public class Node
{
	public int data;
	public Node link;
	
	public Node(int a)
	{
		data=a;
		link=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}